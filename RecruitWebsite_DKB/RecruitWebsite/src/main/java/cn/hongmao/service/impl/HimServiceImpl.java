package cn.hongmao.service.impl;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.util.ResourceUtils;
import org.springframework.web.multipart.MultipartFile;

import com.corundumstudio.socketio.AckRequest;
import com.corundumstudio.socketio.HandshakeData;
import com.corundumstudio.socketio.SocketIOClient;
import com.corundumstudio.socketio.annotation.OnEvent;

import cn.hongmao.mapper.ChatMapper;
import cn.jasonone.him.HimConst;
import cn.jasonone.him.model.HimFriend;
import cn.jasonone.him.model.HimGroup;
import cn.jasonone.him.model.HimStatus;
import cn.jasonone.him.model.HimUserInfo;
import cn.jasonone.him.model.Message;
import cn.jasonone.him.service.HimService;
import cn.jasonone.him.util.HimUtil;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class HimServiceImpl implements HimService {
	private static Map<String, HimUserInfo> users = new HashMap<>();
	private static Map<String, HimFriend> friends = new HashMap<>();
	private static HimGroup group;
	
	@Resource
	private ChatMapper chatMapper;
	
	static {
		// 构建模拟数据
		{
			// 初始化群
			group = new HimGroup().setId("1").setGroupname("My Home").setList(new ArrayList<>());
			group.setAvatar("http://tp1.sinaimg.cn/1571889140/180/40030060651/1");
		}
//		{
//			// 创建测试员
//			for (int i = 1; i < 5; i++) {
//				HimUserInfo userInfo = new HimUserInfo();
//				userInfo.setId("" + i);
//				userInfo.setAvatar("http://tp1.sinaimg.cn/1571889140/180/40030060651/1");
//				userInfo.setUsername("测试员" + i);
//				userInfo.setStatus(HimStatus.ONLINE);
//				if (i == 1) {
//					group.setOwner(userInfo);
//				}
//				group.getList().add(userInfo);
//				users.put(userInfo.getId(), userInfo);
//			}
//		}
//		{
//			// 互相添加好友
//			for (int i = 1; i < 5; i++) {
//				HimUserInfo userInfo = users.get("" + i);
//				HimFriend friend = new HimFriend();
//				friend.setGroupname("我的消息");
//				friend.setList(new ArrayList<>());
//				friend.setId("" + i);
//				for (int j = 1; j < 5; j++) {
//					if (j != i) {
//						friend.getList().add(users.get("" + j));
//					}
//				}
//				friends.put(userInfo.getId(), friend);
//			}
//		}

	}

	@Override
	public boolean isAuthorization(HandshakeData data) {
		// 在此处可以获得前端传递的userId,从而进行权限鉴定
		// 返回值代表是否允许建立连接
		// String userId = data.getSingleUrlParam("userId");
		return HimService.super.isAuthorization(data);
	}

	@Override
	public void messageFriend(SocketIOClient client, AckRequest request, Message message) {
//		HimUserInfo friend = users.get(message.getId());
		HimUserInfo friend = users.get(message.getId());
		// 获得当前客户端中的用户对象
		// 注意: 此处获得的用户对象为,HimService.connect方法返回的用户对象
		HimUserInfo user = HimUtil.getUserInfo(client);
		if(friend.getStatus().name().equals("ONLINE")) {
			// 发送消息给好友
			HimUtil.sendFriend(user, friend, message.getMessage());
		}
	}

	@Override
	public void messageGroup(SocketIOClient client, AckRequest request, Message message) {
		// 发送群消息
		HimUtil.sendGroup(client, message.getId(), message.getMessage());
	}

	@Override
	public void messageSystem(SocketIOClient client, AckRequest request, Message message) {
		// 此处为系统消息监听
	}

	@Override
	public HimUserInfo connection(SocketIOClient client) {
		HandshakeData data = client.getHandshakeData();
		String userId = data.getSingleUrlParam("userId");
		String callToId = data.getSingleUrlParam("callTo");
		if(callToId != null && !callToId.equals("null") && !callToId.equals("")) {
			if(chatMapper.isHave(Integer.parseInt(userId), Integer.parseInt(callToId)) == null) {
				chatMapper.addFriend(Integer.parseInt(userId), Integer.parseInt(callToId));
				chatMapper.addFriend(Integer.parseInt(callToId), Integer.parseInt(userId));
			}
		}
		HimUserInfo userInfo = chatMapper.findInfoById(Integer.parseInt(userId));
		HimUtil.addGroup(client, group.getId());
		HimUtil.sendSystem("用户上线", userInfo);
		userInfo.setStatus(HimStatus.ONLINE);
		users.put(userId, userInfo);
		// 客户端成功建立连接时触发,该方法必须返回一个对象,
		// 否则使用HimUtil.getUserInfo()方法将获取不到值
		return userInfo;
	}

	@Override
	public void disconnection(SocketIOClient client, HimUserInfo user) {
		log.debug("用户离线:{}", user.getUsername());
	}

	@Override
	public HimUserInfo findMine(String userId) {
		//根据用户ID,查询用户信息
		return users.get(userId);
//		return chatMapper.findInfoById(Integer.parseInt(userId));
	}

	@Override
	public List<HimFriend> findFriends(String userId) {
		//根据用户ID,查询用户的好友信息
		List<HimFriend> friends = new ArrayList<>();
		//friends.add(HimServiceImpl.friends.get(userId));
		
		List<HimUserInfo> friendsById = chatMapper.findFriendsById(Integer.parseInt(userId));
		HimFriend friend = new HimFriend();
		friend.setGroupname("我的消息");
		friend.setList(friendsById);
		
		friends.add(friend);
		
		return friends;
	}

	@Override
	public List<HimGroup> findGroups(String userId) {
		//根据用户ID,查询用户所有的群组信息
		List<HimGroup> groups = new ArrayList<>();
		groups.add(group);
		return groups;
	}

	@Override
	public HimGroup findGroupById(String groupId) {
		//根据群ID,查询群详细信息
		return group;
	}

	@Override
	public String uploadImage(MultipartFile file) throws Exception {
		File file2 = ResourceUtils.getFile("classpath:");
		file2 = new File(file2, "static/images");
		if (!file2.exists()) {
			file2.mkdirs();
		}
		file2 = new File(file2, file.getOriginalFilename());
		file.transferTo(file2);
		return "/images/" + file.getOriginalFilename();
	}

	@Override
	public String uploadFile(MultipartFile file) throws Exception {
		File file2 = ResourceUtils.getFile("classpath:");
		file2 = new File(file2, "static/file");
		if (!file2.exists()) {
			file2.mkdirs();
		}
		file2 = new File(file2, file.getOriginalFilename());
		file.transferTo(file2);
		return "/file/" + file.getOriginalFilename();
	}

}
