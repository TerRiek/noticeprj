package com.example.noticePrj.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.noticePrj.dao.INoticeDao;

@Controller
public class IndexController {

	@RequestMapping("/")
	public String root() {
		return "index";
	}
	
}