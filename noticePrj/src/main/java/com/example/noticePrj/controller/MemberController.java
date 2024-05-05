package com.example.noticePrj.controller;

import java.io.IOException;
import java.io.PrintWriter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.noticePrj.dao.IMemberDao;
import com.example.noticePrj.dto.MemberDto;

import jakarta.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("/member")
public class MemberController {

	@Autowired
	private IMemberDao dao;

	@GetMapping("/registMemberForm")
	public String registMemberForm() {
		return "registMemberForm";
	}

	@PostMapping("/checkValidId")
	public void checkValidId(@RequestParam("id") String id, HttpServletResponse response) throws IOException {
		response.setContentType("text/html; charset=utf-8;");
		PrintWriter out = response.getWriter();
		int result = dao.checkValidId(id);
		if (result == 1 || id.trim().isEmpty()) {
			out.print("사용 불가능한 아이디입니다!");
		} else {
			out.print("사용 가능한 아이디입니다!");
		}
	}
	
	@PostMapping("/registMember")
	public void registMember(MemberDto dto) {
		int result = dao.registMemberDto(dto);
		if(result == 1) {
			
		}
	}
}