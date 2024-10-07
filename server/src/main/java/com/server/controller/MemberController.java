package com.server.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/server/member")
public class MemberController {

	@PostMapping("/signup")
	public ResponseEntity signup() {
		System.out.println("안녕");
		return ResponseEntity.status(HttpStatus.OK).build();
	}
	
	@PostMapping("/login")
	public ResponseEntity login() {
		System.out.println("안녕");
		return ResponseEntity.status(HttpStatus.OK).build();
	}
	
}
