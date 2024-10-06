package com.amitu.async;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class UserService {
	
	@Async
	public void asyncMethodTest() {
		System.out.println("Inside asyncMethodTest : "+Thread.currentThread().getName());
		
		try {
			Thread.sleep(50000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
