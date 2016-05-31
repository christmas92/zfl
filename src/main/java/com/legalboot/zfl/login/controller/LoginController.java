package com.legalboot.zfl.login.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/login")
public class LoginController {
	
	@RequestMapping("/auth")
	@ResponseBody
	public Map<String, Object> auth(){
		Map<String, Object> map = new HashMap<>();
		map.put("user", "lost");
		return map;
	}
}
