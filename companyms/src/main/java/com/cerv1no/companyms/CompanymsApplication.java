package com.cerv1no.companyms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class CompanymsApplication {

	public static void main(String[] args) {
		SpringApplication.run(CompanymsApplication.class, args);
	}

}