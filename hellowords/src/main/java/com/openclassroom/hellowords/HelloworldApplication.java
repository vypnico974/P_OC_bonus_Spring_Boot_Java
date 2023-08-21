package com.openclassroom.hellowords;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.openclassroom.hellowords.model.Helloworld;
import com.openclassroom.hellowords.service.BusinessService;

@SpringBootApplication
public class HelloworldApplication implements CommandLineRunner {

	@Autowired
	private BusinessService bs;

	public static void main(String[] args) {
		SpringApplication.run(HelloworldApplication.class, args);
		
	}

	@Override
    public void run(String... args) throws Exception {
		Helloworld hw = bs.getHelloworld();
        // System.out.println("Hello words!");
		 System.out.println(hw);
    }

}
