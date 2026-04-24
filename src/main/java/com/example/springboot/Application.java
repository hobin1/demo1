package com.example.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
    public void sayHello() {
        System.out.println("Hello from Demo1Application!");
    }

    public int addNumbers(int a, int b) {
        return a + b;
    }

    public String getStatus() {
        return "Application is running";
    }

    public void sayHello() {
        System.out.println("Hello from Demo1Application!");
    }

    public int addNumbers(int a, int b) {
        return a + b;
    }

    public String getStatus() {
        return "Application is running";
    }

}
