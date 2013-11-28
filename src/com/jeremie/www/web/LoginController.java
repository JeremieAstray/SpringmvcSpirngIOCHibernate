package com.jeremie.www.web;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jeremie.www.entity.User;
import com.jeremie.www.service.UserService;

@Controller
public class LoginController {

	@Resource(name = "userService")
	private UserService userService;

	@RequestMapping("/login")
	public String getUser(String userNum,String password,HttpServletRequest request, Model model/*,RedirectAttributes ra*/) {
		User user = new User();
		user.setUserNum(userNum);
		user.setPassword(password);
		user = userService.getUser(user);
		if(user!= null){
			model.addAttribute("user", user);
			//ra.addFlashAttribute(user);
			return "success";
		} else {
			return "loginfail";
		}
	}
	
	@RequestMapping("/loginpage")
	public String getUser(HttpServletRequest request) {
		return "login";
	}
}
