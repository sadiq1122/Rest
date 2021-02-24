package com.example;

import com.example.FetchAPI.CovidAPI;
import com.example.Models.Student;
import com.sun.prism.impl.PrismSettings;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.swagger2.annotations.EnableSwagger2;



@EnableSwagger2
@SpringBootApplication
@RestController
@RequestMapping("/studentPortfolio")
public class ResTfullApplication {

   public static Logger log = LoggerFactory.getLogger(ResTfullApplication.class);

   @Autowired
   CovidAPI api;

    @RequestMapping(value = "/health",method = RequestMethod.GET)
    public String health()
    {
        api.data();



        return  "Success";
    }


    public static void main(String[] args) {
        SpringApplication.run(ResTfullApplication.class, args);
        System.out.println("hello there");

        Student s = new Student.StudentBuilder("65").withName("Sadiq").withCourses("Java C++").build();
        log.info(s.toString());



    }

        }






