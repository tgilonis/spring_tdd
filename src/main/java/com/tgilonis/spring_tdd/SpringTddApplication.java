package com.tgilonis.spring_tdd;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringTddApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringTddApplication.class, args);
	}

	// Provide database with data to test api call from postman
	/*@Bean
	public CommandLineRunner setup(ToDoRepository toDoRepository) {
		return (args) -> {
			toDoRepository.save(new ToDo("Add a new test case", true));
			toDoRepository.save(new ToDo("Make it fail", true));
			toDoRepository.save(new ToDo("Do changes to the code", false));
			toDoRepository.save(new ToDo("Pass the test", true));
		};
	}*/
}
