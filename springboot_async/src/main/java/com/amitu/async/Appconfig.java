package com.amitu.async;

import java.util.concurrent.Executor;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

@Configuration
public class Appconfig {

	@Bean(name = "myThreadpoolExecutor")
	public Executor taskPoolexecutor() {
		int minPoolSize = 2;
		int maxPoolSize = 4;
		int queueSize = 3;
		
		ThreadPoolTaskExecutor threadPoolTaskExecutor = new ThreadPoolTaskExecutor();
		threadPoolTaskExecutor.setCorePoolSize(minPoolSize);
		threadPoolTaskExecutor.setMaxPoolSize(maxPoolSize);
		threadPoolTaskExecutor.setQueueCapacity(queueSize);
		threadPoolTaskExecutor.setThreadNamePrefix("MyThread-");
		threadPoolTaskExecutor.initialize();
		return threadPoolTaskExecutor;
		
	}
}
