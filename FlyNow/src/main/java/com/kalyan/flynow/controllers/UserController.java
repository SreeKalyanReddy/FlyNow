package com.kalyan.flynow.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.kalyan.flynow.entities.User;
import com.kalyan.flynow.repos.UserRepository;

@Controller
public class UserController {

	@Autowired
	UserRepository userrepo;

	@RequestMapping("/index")
	public String welcome() {
		return "login/index";

	}

	@RequestMapping("/showReg")
	public String showRegistrationPage() {
		return "login/registerUser";
	}

	@PostMapping("/registerUser")
	public String registerUser(@ModelAttribute("user") User user) {
		userrepo.save(user);
		return "login/index";
	}

	@PostMapping("/login")
	public String registerUser(@RequestParam("email") String email, @RequestParam("password") String password,
			ModelMap map) {
		User user = userrepo.findByEmail(email);
		if (user.getPassword().equals(password)) {
			return "flights/searchflights";
		} else {
			map.addAttribute("msg", "Invalid Details");

			return "login/index";
		}
	}

}