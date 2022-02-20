package com.cos.controllerdemo.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HttpRedirectionController {
	
	@GetMapping("/home")
	public String home() {
		//1만줄 이 있다고 가정
		return "home";
	}
	
	@GetMapping("/away")
	public String away() {
		//다른코드..
		//1만줄의 home과 같은 코드가 있다고 가정..
		//그래서 home으로 리다이렉션 할 거임
		return "redirect:/home";//리다이렉트 된다. (단, @Controller가 붙어있을 때만 가능)
	}
}
