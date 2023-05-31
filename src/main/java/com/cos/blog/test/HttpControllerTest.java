package com.cos.blog.test;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

// 사용자가 요청 -> 응답(Html 파일)
//@Controller

// 사용자가 요청 -> 응답(Data)
@RestController
public class HttpControllerTest {
		private static final String TAG = "HttpControllerTest";		
		// http://localhost:8080/http/lombok(select)
		@GetMapping("/http/lombok")
		public String lombokTest() {
			//Member m = new Member(1, "유동수", "abc@co.kr" );
			Member m = Member.builder().id(1).name("유동수").email("abc@co.kr").build();
			
			System.out.println(TAG+"getter : "+m.getId()+"/"+m.getName()+"/"+m.getEmail()+"/");
			m.setId(5000);
			System.out.println(TAG+"getter : "+m.getId()+"/"+m.getName()+"/"+m.getEmail()+"/");
			return "lombok 테스트 완료";
		}	
		
		// 인터넷 브라우저 요청은 Get 요청밖에 안된다. 
		// http://localhost:8080/http/get (select)
		@GetMapping("/http/get")
		//public String getTest(@RequestParam int id, @RequestParam String name, @RequestParam String email) {
		public String getTest(Member m) {
			//return "get 요청 : " + id  + "/ " +  name + "/ "+  email  ;
			return "get 요청 : " + m.getId()  + "/ " +  m.getName() + "/ "+  m.getEmail()  ;
		}
		
		// http://localhost:8080/http/post (post)
		@PostMapping("/http/post") // text/plain, application/json
		//public String postTest(@RequestBody String text) {
		public String postTest(@RequestBody Member m) {	// MessageConverTer(스프링부트) 기능
			//return "post 요청 : " + text  ;
			return "post 요청 : " + m.getId()  + "/ " +  m.getName() + "/ "+  m.getEmail()  ;
		}
		
		// http://localhost:8080/http/put (put)
		@PutMapping("/http/put")
		public String putTest(@RequestBody Member m) {		// MessageConverTer(스프링부트) 기능
			return "put 요청: " + m.getId()  + "/ " +  m.getName() + "/ "+  m.getEmail()  ;
		}
		
		// http://localhost:8080/http/delete (delete)
		@DeleteMapping("/http/delete")
		public String deleteTest() {
			return "delete 요청";
		}
}
