package com.example.springconsoleapp;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.annotation.Order;



@SpringBootApplication
@Order(2)
public class SpringConsoleAppApplication implements CommandLineRunner {


    public static void main(String[] args) {
        System.out.println ("Begin main");
        SpringApplication.run (SpringConsoleAppApplication.class, args);
        System.out.println ("End main");
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println ("Hello world from Spring-boot");
    }
}
