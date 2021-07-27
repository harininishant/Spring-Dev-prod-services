package com.example.springjdbc2.Service;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class FootBall implements Game{
    @Override
    public void play() {
        System.out.println("FootBall");
    }

    public FootBall() {

        System.out.println("@@@@@@@@ Foot Ball Created @@@@@@@@@@");
    }
}
