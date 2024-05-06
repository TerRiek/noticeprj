package com.example.noticePrj.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

	@Autowired
	private INoticeDao dao;
	@RequestMapping("/")
	public String root() {
		return "index";
	}
	
}