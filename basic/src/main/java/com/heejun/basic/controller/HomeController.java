package com.heejun.basic.controller;

//로그 파일에 시간별로 저장해놓기 
//logger 쓰는이유
//1. 출력속도가 빠르다
//2. 파일 등을 이용하여 관리가 용이함

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class HomeController {
	Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@RequestMapping("/")
	public String home() {
		log.trace("trace!");
		log.debug("debug!");  // 개발단계에서 확인용
		log.info("info!");	 // 운용 상 필요한 정보
		log.warn("warn!");	 // 메모리 문제 등 경고
		log.error("error!");	 // 치명적인 오류		
		return "home";
	}
}