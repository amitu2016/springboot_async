package com.amitu.async;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/getuser")
	public String getUserMethod() {
		System.out.println("Inside getUserMethod : "+Thread.currentThread().getName());
		userService.asyncMethodTest();
		return new String("Hello");
	}
	
}
