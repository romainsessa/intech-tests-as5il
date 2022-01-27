package com.intech.zooapi.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApplicationController {
	
	@GetMapping(value = "/")
	public String getNameApplication() throws InterruptedException {
		return "Zoo Application";
	}
}
