package com.greyson.gycptest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.greyson.gycptest.entity.UserModel;
import com.greyson.gycptest.service.UserService;

@Controller
@RequestMapping(value = "/user")
public class UserController {
	@Autowired
	private UserService userService;

	@ResponseBody
	@PostMapping("/add")
	public int addUser(UserModel user) {
		return userService.addUser(user);
	}
	@ResponseBody
	@GetMapping("/findAll")
	public Object findAllUser(
			@RequestParam(name = "pageNum", required = false, defaultValue = "1") int pageNum,
			@RequestParam(name = "pageSize", required = false, defaultValue = "10") int pageSize) {
		return userService.findAllUser(pageNum, pageSize);

	}
	
	@GetMapping("/hello")
	public String getUsers () {
	    return "Hello Spring Security";
	}
	    
	
}
