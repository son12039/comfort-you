package com.server.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/server/board")
@CrossOrigin(origins = {"*"}, maxAge = 6000)
public class BoardController {

}
