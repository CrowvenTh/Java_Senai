package com.senai.primeirospassos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@SpringBootApplication
public class PrimeirospassosApplication {

	@RequestMapping("/")
	String home() {
		return "Olá Mundo!";
	}

	@RequestMapping("user")
	public String user() {
		return "Não há usuários cadastrados";
	}

	@RequestMapping("calc")
	public int calc() {
		return 3 * 3;
	}

	public String requestMethodName(@RequestParam String param) {
		return new String();
	}

	public static void main(String[] args) {
		SpringApplication.run(PrimeirospassosApplication.class, args);
	}

}
