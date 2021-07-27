package com.example.springjdbc2.Service;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class BasketBall implements Game{
    @Override
    public void play() {
        System.out.println("Basketball");
    }

    public BasketBall() {// contsructor
        System.out.println("@@@@@@@@ Basket Ball Created @@@@@@@@@@");

    }
}
