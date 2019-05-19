package com.example.websocketdemo;

import com.example.websocketdemo.config.WebSocketConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class WebsocketDemoApplication {
	private static final Logger logger = LoggerFactory.getLogger(WebsocketDemoApplication.class);
	public static void main(String[] args) {
		logger.info("main Application Class --- Loding");
		SpringApplication.run(WebsocketDemoApplication.class, args);
	}
}
