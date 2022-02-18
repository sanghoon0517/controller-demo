package com.cos.controllerdemo.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.cos.controllerdemo.web.domain.User;

@Controller //파일을 응답할 것이기 때문에
public class JavaToJSPController {
	
	@GetMapping("/jsp/java")
	public String jspToJava() {
		return "d";
	}
	
	@GetMapping("/jsp/java/model")
	public String jspToJavaToModel(Model model) { //데이터를 페이지로 넘기고 싶을 때 Model을 이용
		
		User user = new User();
		user.setUsername("jsh");
		
		model.addAttribute("username", user.getUsername()); //addAttribute()를 이용해 전달
		return "e";
	}
	
}
