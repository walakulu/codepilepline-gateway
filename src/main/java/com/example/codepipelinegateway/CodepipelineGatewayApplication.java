package com.example.codepipelinegateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class CodepipelineGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(CodepipelineGatewayApplication.class, args);
	}

}
