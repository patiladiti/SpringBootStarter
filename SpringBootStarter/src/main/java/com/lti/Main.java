package com.lti;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//this main class will trigger spring boot
@SpringBootApplication
public class Main {

	public static void main(String[] args) {
		/*triggers the @SpringBootApplication which in turn will trigger @Configuration,
		  @Componentscan and @EnabledAutoConfiguration and will also start the the server
		  automatically. */
		SpringApplication.run(Main.class, args);
	}

}
