package com.server.model;

import lombok.Data;

@Data
public class Board {
	private int code;
	private String password;
	private String nickname;
	private int point;
}