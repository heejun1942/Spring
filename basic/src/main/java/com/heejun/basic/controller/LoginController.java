package com.heejun.basic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class LoginController {
//	서버는 순서가 없음
	
	@GetMapping("/login")
	public String login() {
		return "login";
	}

//	정보를 받아야함.
	@PostMapping("/login")
	@ResponseBody
	public String loginPost(
			@RequestParam("id") String id, 
			@RequestParam("pw") String pw) {
		String dbId = "boot";
		String dbPw = "1234";

		if (dbId.equals(id) && dbPw.equals(pw)) {
			return "로그인 성공";
		}
		return "로그인 실패";
	}
}
