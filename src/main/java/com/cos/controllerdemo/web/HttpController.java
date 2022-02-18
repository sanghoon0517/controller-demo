package com.cos.controllerdemo.web;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author 전상훈
 * 
 * 컨트롤러 어노테이션은 2가지가 있다.
 * 
 * 둘 중에 하나만 써야한다.
 *
 * Controller를 쓸 경우에는 파일명을 리턴해주기 때문에
 * get()메소드를 요청하게 되면 return되는 값이 파일명으로 인식하게 된다. ex) return "index.html"; 이런식이면 index.html로 파일명을 리턴하게된다.
 * 
 * RestController를 쓸 경우에는 data자체를 리턴해주기 때문에
 * get()메소드를 요청하게 되면 return되는 값이 데이터값으로 인식하게 된다. ex) return "get요청됨"; 이런식이면 "get요청됨"이라는 문자열 데이터를 리턴해준다.
 *
 */
//@Controller //File을 응답하는 컨트롤러 (클라이언트가 브라우저라면 .html파일을 리턴을 할 것임)
@RestController //data를 응답하는 컨트롤러 (클라이언트가 핸드폰이면 data를 응답할 것임)
public class HttpController {
	
	// http://localhost:8080/get
	@GetMapping("/get")
	public String get() {
		return "<h1>get요청됨</h1>";
	}
	
	// http://localhost:8080/post
	@PostMapping("/post")
	public String post() {
		return "post요청됨";
	}
	
	// http://localhost:8080/put
	@PutMapping("/put")
	public String put() {
		return "put요청됨";
	}
	
	// http://localhost:8080/delete
	@DeleteMapping("/delete")
	public String delete() {
		return "delete요청됨";
	}
}
