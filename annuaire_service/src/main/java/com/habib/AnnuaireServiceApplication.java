package com.habib;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class AnnuaireServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AnnuaireServiceApplication.class, args);
	}

}
