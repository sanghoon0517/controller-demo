package com.cos.controllerdemo.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cos.controllerdemo.web.domain.User;

@RestController
public class HttpBodyController {
	
	
	private static final Logger log = LoggerFactory.getLogger(HttpBodyController.class);

	
	@PostMapping("/body1")
	public String xwwwform(String username) { //요청하는 key값이란 메서드에서 받는 파라미터 네임이랑 같아야 받을 수 있다.
		log.info(username);
		return "key=value 전송옴";
	}
	
	@PostMapping("/body2")
	public String textplain(@RequestBody String data) { //평문 //변수명은 아무거나 적어도 가능
		//받아온 요청 평문 데이터
		log.info("받아온 요청 평문 데이터 : "+data);
		return "text/plain 전송옴";
	}
	
	@PostMapping("/body3")
	public String applicationjson(@RequestBody String data) { //RequestBody 어노테이션을 이용해서 요청 데이터값을 통쨰로 자바객체로 변환되어 받아올 수 있음
		//받아온 요청 JSON 데이터
		log.info("받아온 요청 JSON 데이터 : "+data);
		return "json 전송옴";
	}
	
	@PostMapping("/body4")
	public String applicationjsonToObject(@RequestBody User user) { //RequestBody 어노테이션을 이용해서 요청 데이터값을 통쨰로 자바객체로 변환되어 받아올 수 있음
		//받아온 요청 JSON 데이터
		log.info("받아온 요청 JSON 데이터 중 username값 : "+user.getUsername());
		return "json 전송옴";
	}
}
