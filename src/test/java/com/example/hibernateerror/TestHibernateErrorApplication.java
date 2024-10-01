package com.example.hibernateerror;

import org.springframework.boot.SpringApplication;

public class TestHibernateErrorApplication {

    public static void main(String[] args) {
        SpringApplication.from(HibernateErrorApplication::main).with(TestcontainersConfiguration.class).run(args);
    }

}
