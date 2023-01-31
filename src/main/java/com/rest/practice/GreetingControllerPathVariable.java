package com.rest.practice;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class GreetingControllerPathVariable {

	@GetMapping("/greetingpath/{name}")
	public String greeting(@PathVariable(value="name", required=false) String name, Model model) {
		model.addAttribute("name", name);
		return "greeting";
	}

}