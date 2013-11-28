package com.jeremie.www.web;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.jeremie.www.entity.User;
import com.jeremie.www.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {

	@Resource(name = "userService")
	private UserService userService;

	@RequestMapping("/register")
	public String addUser(User user, HttpServletRequest request, Model model/*
																			 * ,
																			 * RedirectAttributes
																			 * ra
																			 */) {
		// request.getParameter(arg0)
		userService.addUser(user);
		model.addAttribute("user", user);
		/* ra.addFlashAttribute(user); */
		// request.setAttribute("user", user);
		return "success";
	}

	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public String updateUser(User user, HttpServletRequest request, Model model) {
		// user = userService.updateUser(user);
		if (user != null) {
			model.addAttribute("user", user);
			return "success";
		} else {
			return "loginfail";
		}
	}

	@RequestMapping(value = "/update/{id}", method = RequestMethod.GET)
	public String updateInfoUser(@PathVariable("id")/* @RequestParam(required = false)*/ Integer id,
			HttpServletRequest request, Model model) {
		if (id != null) { 
			User user = new User();
			user.setId(id);

			// user = userService.(user);
			user.setUserNum("admin");
			user.setName("123");
			user.setPassword("123");
			user.setQq("123");

			model.addAttribute("user", user);
			return "update";
		}
		return "loginfail";
	}

}
