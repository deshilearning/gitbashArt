package com.gitbash.gitbashArt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@SpringBootApplication
public class GitbashArtApplication {

	public static void main(String[] args) {
		SpringApplication.run(GitbashArtApplication.class, args);
	}

	@GetMapping("/name")
	public String getName() {
		return "Desh Deepak";
	}
}
