package com.heejun.basic.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MethodController {
	@GetMapping("req/get")
	@RequestMapping(value = "req/get", method = RequestMethod.GET)
	public String get() {
		return "GET";
	}

//	브라우저를 통해 어딘가 접속하면 무조건 get방식임
//	post로 접속불가. > 따라서, restlet client으로 연습하자.
	@PostMapping("req/post")
	@RequestMapping(value = "req/post", method = RequestMethod.POST)
	public String post() {
		return "POST";
	}
	
//	두 줄 중 한줄만 쓰면됨 (위에꺼가 요즘스타일)
	@PutMapping("req/put")
	@RequestMapping(value="req/put", method=RequestMethod.PUT)
	public String put() {
	return "PUT";
	}
	
	@DeleteMapping("req/delete")
	@RequestMapping(value="req/delete", method=RequestMethod.DELETE)
	public String delete() {
	return "DELETE";
	}
}