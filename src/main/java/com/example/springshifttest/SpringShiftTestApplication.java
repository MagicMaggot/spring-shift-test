package com.example.springshifttest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringShiftTestApplication {
    @RequestMapping("/")
    public String welcome() {
        return "Welcome aliens";
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringShiftTestApplication.class, args);
    }

}
