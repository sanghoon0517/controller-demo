package com.cos.controllerdemo.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 전상훈
 * 
 * Query String 방식과 Path Variable 방식을 이용해보자.
 * 
 * 1. Query String 방식은 url path 뒤에 "?" (물음표)를 붙이고 "key=value" 형식에 맞춰서 파라미터와 값(value)을 넘겨줄 수 있다.
 * ex) /chicken?맛=양념
 * 
 * 2. Path Variable 방식(주소변수매핑)은 url path뒤에 "/"(슬래쉬)를 붙여서 파라미터에 대한 값을 바로 붙여서 데이터를 넘겨줄 수 있다.
 * ex) /chick/양념
 * 
 * 위와 같은 방식으로 구체적인 데이터를 요청할 수 있다.
 * 
 */
@RestController
public class QueryPathController {
	
	@GetMapping("/chicken")
	public String chickenQuery(String type) { //get방식의 쿼리스트링을 이용해서 파라미터와 똑같은 변수명으로 값을 요청하면 데이터가 알아서 맵핑된다. 
		return type+" 배달갑니다.(Query String)";
	}
	
	@GetMapping("/chicken/{type}")
	public String chickenPath(@PathVariable String type) {
		return type+" 배달갑니다.(주소변수매핑)";
	}
	
}
