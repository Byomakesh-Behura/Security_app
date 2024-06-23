package com.core.security.apicontroller;

import java.security.Principal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {
	
	
	@GetMapping("/route1")
	public String route1(Principal principal) {
		return "This is protected route1"+principal;
	}
	
	@GetMapping("/route2")
	public String route2(Principal principal) {
		return "This is protected route2"+principal;
	}

}
