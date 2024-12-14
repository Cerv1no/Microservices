package com.cerv1no.jobhuntingms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class JobhuntingmsApplication {

	public static void main(String[] args) {
		SpringApplication.run(JobhuntingmsApplication.class, args);
	}

}
