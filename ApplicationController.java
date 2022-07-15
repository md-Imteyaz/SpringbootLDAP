package com.SpringbootLDAP.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest")
public class ApplicationController {
	@GetMapping("/secure")
	public String securemethod() {
		return "secure rest endpoint";
		
	}

}
