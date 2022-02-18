package com.cos.controllerdemo.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cos.controllerdemo.web.domain.User;

@RestController
public class HttpResponseJsonController {
	
	@GetMapping("/resp/json")
	public String respJson() {
		return "{\"username\" : \"jsh\"}";
	}
	
	@GetMapping("/resp/json/object")
	public String respJsonObject2() {
		User user = new User();
		user.setUsername("전상훈");
		String resData = "{\"username\" : \""+user.getUsername()+"\"}";
		return resData;
	}
	
	@GetMapping("/resp/json/javaobject")
	public User respJsonObject() {
		User user = new User();
		user.setUsername("전상훈");
		return user; 
		/*
		 * 1. 스프링의 MessageConverter가 웹브라우저에 응답을 내보낼때 자동으로 JavaObject를 Json(구-xml)으로 변경해서 통신을 통해 응답을 해준다.
		 * 2. @RestController일 때만 MessageConverter가 작동한다. 
		 *  @ResponseBody를 통해 MessageConverter가 동작하는데 @RestController 어노테이션 안에 @ResponseBody가 있어서 자동으로  MessageConverter가 동작하게 된다.
		 * 
		 * */
	}
	
}
