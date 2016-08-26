package com.ryanjbaxter.spring.cloud.ocr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class OcrConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(OcrConfigServerApplication.class, args);
	}
}
