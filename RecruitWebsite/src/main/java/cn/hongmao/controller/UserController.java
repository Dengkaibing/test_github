package cn.hongmao.controller;

import java.util.regex.Pattern;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.aliyuncs.exceptions.ClientException;

import cn.hongmao.bean.UserInfo;
import cn.hongmao.service.UserInfoService;
import cn.hongmao.util.SendSms;
@Controller
public class UserController {
   
	
	@Resource
	private UserInfoService userInfoService;
	private int code = SendSms.getCode();
	
	@RequestMapping({"/index","/index.html"})
	public String index() {
		return "Zlog/index";
	}
	
    @RequestMapping({"/login","/login.html"})
	public String login() {
		return "Zlog/login";
	}
	
    @RequestMapping({"/register","/register.html"})
	public String register() {
		return "Zlog/register";
	}
    
    
    /**
	 * 用户名+密码登录
	 * 
	 * @param userName
	 * @param password
	 * @param map
	 * @param session
	 * @return
	 */
	@PostMapping("/passlogin")
	public String passLogin(String phone, String password, ModelMap map, HttpSession session) {
		String msg = null;
		UserInfo suserInfo = new UserInfo();
		suserInfo.setPhone(phone);
		suserInfo.setPassword(password);
		msg = userInfoService.getUserByPhone(suserInfo);
		if (msg == null) {
			UserInfo userInfo = userInfoService.getUserInfoByPhone(phone);
			System.out.println(userInfo);
			session.setAttribute("userInfo", userInfo);
			if(userInfo.getStatus() == 0) {
				return "redirect:hunter/insert";
			}else {
				return "redirect:employer/insert";
			}
		} else {
			map.put("msg", msg);
			return "Zlog/login";

		}
	}
	
	
	/**
	 * 短信登录的获取验证码方法
	 * 
	 * @param phone
	 * @param map
	 * @return
	 */
	@ResponseBody
	@PostMapping("/login/getCode")
	public String getCode(String phone, ModelMap map) {
		String msg1 = null;
		System.out.println(code);

		try {
			msg1 = SendSms.SendMessage(phone, code);
		} catch (ClientException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		map.put("msg1", msg1);
		return msg1;

	}
	

	/**
	 * 短信登录
	 * 
	 * @param yanzheng
	 * @param phone
	 * @param map
	 * @param session
	 * @return
	 */
	@PostMapping("/codelogin")
	public String loginByPhone(String phoneCode, String phone, ModelMap map, HttpSession session) {
		String msg2 = null;
		System.out.println("5555555555"+"()"+phoneCode);
		if (phoneCode == null || phoneCode.trim().isEmpty()) {
		msg2 = "请输入验证码";
		map.put("msg2", msg2);
		System.out.println("111111111111");
			return "Zlog/login";
		} else 
			if (Integer.parseInt(phoneCode) != code) {
				System.out.println("222222222");
			msg2 = "验证码错误";
			map.put("msg2", msg2);
			return "Zlog/login";
		} else {
			if (userInfoService.getUserByPhone(phone)) {
				System.out.println("333333333333333");
				UserInfo userInfo = userInfoService.getUserInfoByPhone(phone);
				session.setAttribute("userInfo", userInfo);
				return "Zlog/index";
			} else {
				System.out.println("44444444444");
				msg2 = "此电话未注册";
				map.put("msg2", msg2);
				return "Zlog/login";
			}
		}
	}
	
	/**
	 * 异步交互验证注册时电话是否可使用
	 * 
	 * @param phone
	 * @param map
	 * @return
	 */
	@ResponseBody
	@PostMapping("/register/phone")
	public String phoneIsExists(String phone, ModelMap map) {

		String regex = "^(13[0-9]|14[5-9]|15[0-3,5-9]|16[2,5,6,7]|17[0-8]|18[0-9]|19[1,3,5,8,9])\\d{8}$";

		String msg4 = null;
		UserInfo user = userInfoService.getUserInfoByPhone(phone);
		if (phone == null || phone == "") {
			msg4 = "电话不能为空";
		} else if (!Pattern.matches(regex, phone)) {
			msg4 = "电话不正确";
		} else if (user == null) {
			msg4 = "此电话可使用";
		} else {
			msg4 = "此电话已注册";
		}
		map.put("msg4", msg4);
		return msg4;
	}
	
	/**
	 * 
	 *应聘用户注册
	 * 
	 * @param yanzheng
	 * @param phone
	 * @param map
	 * @param userName
	 * @param password
	 * @return
	 */
	@PostMapping("/register")
	public String register(String rphonecode, String phone, ModelMap map, String password) {
		String msg5 = null;
		System.out.println("1111111111111111111");
		if (rphonecode == null || rphonecode.trim().isEmpty()) {
			System.out.println("2222222222");
			msg5 = "请输入验证码";
			map.put("msg2", msg5);
			return "Zlog/register";
		} else if (Integer.parseInt(rphonecode) != code) {
			System.out.println("33333333333");
			msg5 = "验证码错误";
			map.put("msg5", msg5);
			return "Zlog/register";
		} else {
			System.out.println("444444444");
			UserInfo user = new UserInfo();
			user.setPhone(phone);
			user.setPassword(password);
			user.setStatus(0);
			userInfoService.insert(user);
			return "Zlog/login";
		}

	}
	
	
	
	
	
	/**
	 * 招聘用户注册
	 * 
	 * @param yanzheng
	 * @param phone
	 * @param map
	 * @param userName
	 * @param password
	 * @return
	 */
	@PostMapping("/appregister")
	public String appregister(String appphonecode, String appphone, ModelMap map, String apppassword) {
		String msg5 = null;
		if (appphonecode == null || appphonecode.trim().isEmpty()) {
			msg5 = "请输入验证码";
			map.put("msg2", msg5);
			System.err.println(88);
			return "Zlog/register";
		} else if (Integer.parseInt(appphonecode) != code) {
			msg5 = "验证码错误";
			map.put("msg5", msg5);
			System.err.println(99);
			return "Zlog/register";
		} else {
			UserInfo user = new UserInfo();
			user.setPhone(appphone);
			user.setPassword(apppassword);
			user.setStatus(1);
			userInfoService.insert(user);
			return "Zlog/login";
		}

	}


    
}
