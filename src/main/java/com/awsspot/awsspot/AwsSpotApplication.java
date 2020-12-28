package com.awsspot.awsspot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@SpringBootApplication
public class AwsSpotApplication {

	public static void main(String[] args) {
		SpringApplication.run(AwsSpotApplication.class, args);
	}

}
