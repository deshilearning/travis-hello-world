package org.jacoco.examples.maven.java;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@SpringBootApplication
public class SbtddApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbtddApplication.class, args);
	}

	@GetMapping(path = "/api/tdd/{data}")
	public String getData(@PathVariable("data") String data) {
		return data;
	}
}
