package com.onesoft.Devops.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class Devopscontroller {
	@GetMapping("hi")
	public String getName() {
		return "ithula ounm illa close it";
	}

}
