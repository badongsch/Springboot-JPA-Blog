package com.cos.blog.model;

import java.security.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.data.annotation.CreatedDate;

@Entity	// User 클래스가 Mysql에 테이블이 생성된다 .
public class User {
	
	@Id	// Primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY) // 프로젝트에서 연결된 DB의 넘버링 전략을 따라간다.
	
	private int id; //시퀀스, auto_increment
	
	@Column(nullable = false, length=30)	// nullable : null 유무 false, length: 길이	
	private String username;	// 아아디
	
	@Column(nullable = false, length=100)	// 123456 => 해쉬(비밀버호 암호화)
	private String password;	// 비번
	
	@Column(nullable = false, length=50)	
	private String email;	// 이메일

	@ColumnDefault("'user'")	// 컴럼을 user로 디폴트 값을 준다.
	private String role ;	// Enum을 쓰는게 좋다.  //admin, num, manager(도메인 설정 => 도메인은 범위를 말한다.)

	//@CreationTimestamp는 Hibernate에서 제공하는 어노테이션이고
	//@CreatedDate는 Spring에서 제공하는 어노테이션이다. 요즘은 이쪽을 사용하는 추세라고 한다
	@CreatedDate	// 시간이 자동 입력 오류 발생하여 아래 코드로 변경
	private Timestamp createDate;		// 가입시간
	
}
