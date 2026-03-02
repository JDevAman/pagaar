package com.devaman.pagaar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PagaarApplication {

	public static void main(String[] args) {

		int port = 3000;
		SpringApplication.run(PagaarApplication.class, args);
		System.out.println("Server is live at:" + port);
	}

}
