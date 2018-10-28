package com.module.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class Calculator {
    private double resoult;

    @Autowired
    private Display display;

    public void add( double a, double b){
        resoult = a + b;
        System.out.printf("add: ");
        display.displayValue(resoult);
    }

    public void sub( double a, double b){
        resoult = a - b;
        System.out.printf("sub: ");
        display.displayValue(resoult);
    }

    public void mull( double a, double b){
        resoult = a * b;
        System.out.printf("mull: ");
        display.displayValue(resoult);
    }

    public void div( double a, double b){
        resoult = a / b;
        System.out.printf("div: ");
        display.displayValue(resoult);
    }
}
