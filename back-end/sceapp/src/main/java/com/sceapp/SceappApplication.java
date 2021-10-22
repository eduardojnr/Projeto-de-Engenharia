package com.sceapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RequestMapping(value="")
public class SceappApplication {

	public static String main(String[] args) {
		SpringApplication.run(SceappApplication.class, args);
		return "sceapp";
	}

}
