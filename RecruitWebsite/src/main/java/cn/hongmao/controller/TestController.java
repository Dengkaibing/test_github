package cn.hongmao.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;

import com.corundumstudio.socketio.SocketIOClient;
import com.corundumstudio.socketio.SocketIOServer;
import com.corundumstudio.socketio.annotation.OnConnect;

import cn.jasonone.him.service.HimService;

@Controller
public class TestController {
	
	@Resource
	private HimService himService;//

	@GetMapping("/")
	public String home(String userId,@RequestParam(name = "callTo",required = false)String callTo, ModelMap map) {
		System.out.println("userId-------" + userId + "callTo-----------" + callTo);
		map.put("userId", userId);
		if(callTo == null) {
			map.put("callTo", "null");
		}else {
			map.put("callTo",callTo);
		}
		return "chat";
	}

}
