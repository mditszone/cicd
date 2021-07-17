package com.mdits;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/api")
public class TestController {
	
	
	@GetMapping("/welcome")
	public String test() {
		
		return "Welcome to DXC world";
	}

}
