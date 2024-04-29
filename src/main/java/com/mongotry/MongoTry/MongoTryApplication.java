package com.mongotry.MongoTry;

import com.github.cloudyrock.spring.v5.EnableMongock;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableMongock
public class MongoTryApplication {

	public static void main(String[] args) {
		SpringApplication.run(MongoTryApplication.class, args);
	}

}
