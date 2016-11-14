package com.apple.user.controller;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.apple.user.domain.User;
import com.apple.user.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {

	@Resource
	private UserService userService;

	@RequestMapping("/index")
	public String index(HttpServletRequest request) {
		Object obj = request.getSession().getAttribute("user");
		if (obj == null) {
			return "login";
		}
		return "index";
	}

	@RequestMapping("/registIndex")
	public String registIndex() {
		return "regist";
	}

	@RequestMapping("/regist")
	public ModelAndView regist(User user) {
		ModelAndView result = new ModelAndView("registResult");
		userService.regist(user);
		result.addObject("result", "注册成功");
		return result;
	}

	@RequestMapping("/loginIndex")
	public String loginIndex() {
		return "login";
	}

	@RequestMapping("/login")
	public ModelAndView login(User user, HttpServletRequest request) {
		ModelAndView result = new ModelAndView("loginResult");
		user = userService.login(user);
		if (user != null) {
			request.getSession().setAttribute("user", user);
			result.addObject("result", "登录成功");
		} else {
			result.addObject("result", "登录失败");
		}
		return result;
	}
	
	@RequestMapping("/addUsers")
	public Map<String,String> addUsers(){
		Map<String,String> resultMap=new HashMap<String, String>();
		try {
			userService.addUsers();
		} catch (Exception e) {
			System.out.println("抛异常");
		}
		resultMap.put("resut", "success");
		return resultMap;
	}
}
