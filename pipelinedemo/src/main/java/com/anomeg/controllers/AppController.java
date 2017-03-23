package com.anomeg.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class AppController {

	@RequestMapping("/")
	public String home(Model model) {

		return "index";
	}

	@RequestMapping("/partials/{page}")
	public String partialHandler(@PathVariable("page") final String page) {
		return page;
	}
	
	

}
