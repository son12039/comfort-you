package com.server.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.server.model.Member;

@RestController
@RequestMapping("/server/member")
@CrossOrigin(origins ="*")
public class MemberController {
	
	
	@PostMapping("/signup")
	public ResponseEntity signup(@RequestBody Member a) {
		System.out.println(a);
		return ResponseEntity.status(HttpStatus.OK).build();
	}
	
	@PostMapping("/login")
	public ResponseEntity login() {
		System.out.println("안녕");
		return ResponseEntity.status(HttpStatus.OK).build();
	}
}
