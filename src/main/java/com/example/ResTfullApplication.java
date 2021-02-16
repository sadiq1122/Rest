package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@RequestMapping(value = "/studentPortfolio")
@RestController
@EnableSwagger2
public class ResTfullApplication {


    @RequestMapping(value = "/health",method = RequestMethod.GET)
    public String health()
    {
        return  "Success";
    }


    public static void main(String[] args) {
        SpringApplication.run(ResTfullApplication.class, args);
        System.out.println("hello there");


    }


}
