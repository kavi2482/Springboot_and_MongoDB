package com.mongodb.tutorial;

import org.springframework.boot.SpringApplication;

public class TestTutorialApplication {

	public static void main(String[] args) {
		SpringApplication.from(TutorialApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
