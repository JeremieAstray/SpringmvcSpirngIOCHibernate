package com.jeremie.www.web;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.jeremie.www.entity.User;
import com.jeremie.www.service.UserService;


@Controller
@RequestMapping("/user")
public class UserController {

	@Resource(name = "userService")
	private UserService userService;
	
	@RequestMapping("/register")
	public String addUser(User user,HttpServletRequest request,Model model/*,RedirectAttributes ra*/) {
		//request.getParameter(arg0)
		userService.addUser(user);
		model.addAttribute("user",user);
		/*ra.addFlashAttribute(user);*/
		//request.setAttribute("user", user);
		return "success";
	}
	
	@RequestMapping("/login")
	public String getUser(User user,HttpServletRequest request, Model model/*,RedirectAttributes ra*/) {
		user = userService.getUser(user);
		if(user!= null){
			model.addAttribute("user", user);
			//ra.addFlashAttribute(user);
			return "success";
		} else {
			return "loginfail";
		}
	}
}
