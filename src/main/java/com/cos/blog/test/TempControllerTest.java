package com.cos.blog.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TempControllerTest {
	// 파일리턴 기본경로 : src/main/resources/static
	// 리턴명 : /home.html
	// 풀경로 : src/main/resources/static/home.html
	
	//http://localhost:8000/blog/temp/home
	@GetMapping("/temp/home")
	public String tempHome(){
		System.out.println("tempHome()");
		return "/home.html";
	}
	//http://localhost:8000/blog/temp/img
	@GetMapping("/temp/img")
	public String tempImg(){
		System.out.println("tempImg()");
		return "/icon.png";
	}
	//http://localhost:8000/blog/temp/jsp
	//System.out.println("tempJsp()");
	// prefix : /WEB-INF/views/
	//  suffix : .jsp
	// 풀경로 : /WEB-INF/views/test.jsp
	@GetMapping("/temp/jsp")
	public String tempJsp(){
		return "test";
	}
}
