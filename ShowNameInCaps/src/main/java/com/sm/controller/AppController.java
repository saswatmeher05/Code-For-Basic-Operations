package com.sm.controller;

import java.util.Formatter;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.sm.model.AppModel;
import com.sm.util.AppUtil;

@Controller
public class AppController {
	
	@RequestMapping("/showincapital")
	public String showMyName(
			@RequestParam("fname") String fname,
			@RequestParam("lname") String lname,
			Model m
			) {
	
		AppModel model=new AppModel();
		model.setFname(fname);
		model.setLname(lname);
		AppUtil util=new AppUtil();
		Formatter time=util.getHourOfDayMessage();
		String message="Hello "+ model.getFname().toUpperCase()+" "+ model.getLname().toUpperCase();
		m.addAttribute("message", message);
		m.addAttribute("time",time);
		return "showname";
	}
}
