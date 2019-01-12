package com.tinu.flight.reservation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.tinu.flight.reservation.domain.User;
import com.tinu.flight.reservation.repo.UserRepository;

@Controller
public class UserController {
	@Autowired
	UserRepository userRepository;
	@RequestMapping("registerUser")
	public String showUserForm() {
		return "login/registerUser";
	}
	@RequestMapping("/login")
	public String showLogIn() {
		return "login/login";
	}
	public String login(@RequestParam("email")String email,@RequestParam("password")String password) {
		return null;
	}
	@RequestMapping(value="saveUser",method=RequestMethod.POST)
	public String saveUser(@ModelAttribute User user) {
		userRepository.save(user);
		return "login/login";
	}

}
