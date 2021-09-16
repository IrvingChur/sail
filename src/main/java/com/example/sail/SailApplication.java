package com.example.sail;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SailApplication {

    public static void main(String[] args) {
        SpringApplication.run(SailApplication.class, args);
    }

    @GetMapping(value = "/index")
    public String index() {
        return "done";
    }

}
