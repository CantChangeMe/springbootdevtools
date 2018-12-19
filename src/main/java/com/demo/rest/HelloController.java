package com.demo.rest;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

	@RequestMapping("/")
	public String hello(Model model) {
		model.addAttribute("date", getDate());
		return "hello";
	}

	private String getDate() {
		DateFormat dateFormat = new SimpleDateFormat("yyyy/mm/dd HH:mm:ss");
		Date date = new Date();
		//return dateFormat.format(date);
		return "Dec 2018";
	}
}
