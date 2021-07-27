package com.example.springjdbc2;

import com.example.springjdbc2.Service.DummyService;
import com.example.springjdbc2.Service.FootBall;
import com.example.springjdbc2.Service.Game;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Bean;

//@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
/*
Exclusions:
-----------
    org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration, (this excluded it )
 */
@SpringBootApplication
public class Springjdbc2Application {

   // this Autowire creates an object for
    // service using setter method and then methods are called using service object.
    //its passing an object to the variables.

    @Autowired // this is for setter base injection
    private DummyService service;// if we do not want to use setter method we can create constructor



    //@Autowired
    //private FootBall footBall;
//    @Qualifier("footBall")
//    private Game game;


    public static void main(String[] args) {
        SpringApplication.run(Springjdbc2Application.class, args);
    }

    @Bean
    CommandLineRunner runner(){
       return  arg ->{
           System.out.println(service.getServiceName());
           //footBall.play();
           //game.play();
       };
    }

}
