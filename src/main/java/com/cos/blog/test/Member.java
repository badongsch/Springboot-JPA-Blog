package com.cos.blog.test;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

//@Getter 생성자
//@Setter 생성자
// @Data - Getter Setter  생성자 동시에
//@AllArgsConstructor = 전체 생성자 동시에
@Data
//@AllArgsConstructor
@NoArgsConstructor
//final - 불변성 유지
public class Member {
	private  int id;
	private  String name;
	private  String email;
	
	@Builder
	public Member(int id, String name, String email) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
	}	
}
