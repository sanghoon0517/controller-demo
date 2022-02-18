package com.cos.controllerdemo.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller //파일을 리턴할 것이기 때문에 "데이터를 리턴하는 RestController"를 쓰는게 아니라 Controller를 쓴다.
public class HttpRespController {
	
	@GetMapping("txt")
	public String txt() {
		return "a.txt"; //프레임워크 사용중이기 때문에 틀이 이미 정해져 있다. - 일반 정적파일들(txt,img 파일 등등) resources/static/ 폴더 내부가 디폴트 경로로 되어 있다.
	}
	
	@GetMapping("mus")
	public String mus() {
		return "b"; //mustache 템플릿 엔진 라이브러리 등록 완료 -  templates폴더 안에 .mustache를 놔두고 확장자 없이 파일명만 적으면 알아서 찾아간다. 반대로 확장자를 적으면 static폴더를 찾아간다.
	}
	
	@GetMapping("jsp")
	public String jsp() {
		return "c"; //jsp엔진을 사용하게 되면 : src/main/webapp 폴더가 디폴트로 설정된다.
					// 즉 ./WEB-INF/views/c.jsp (ViewResolver설정을 해야한다.)
	}
	
	
}
