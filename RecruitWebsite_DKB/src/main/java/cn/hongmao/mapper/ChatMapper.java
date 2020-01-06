package cn.hongmao.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.hongmao.bean.UserFriends;
import cn.jasonone.him.model.HimUserInfo;

public interface ChatMapper {
	
	public HimUserInfo findInfoById(int userId);
	
	public List<HimUserInfo> findFriendsById(int userId);
	
	public int addFriend(@Param("userId")int userId, @Param("friendId")int friendId);
	
	public UserFriends isHave(@Param("userId")int userId, @Param("friendId")int friendId);

}
