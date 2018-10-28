package com.module.calculator;

import org.springframework.stereotype.Service;

import java.awt.*;

@Service
public class Display {

    public void displayValue(double val){
        System.out.println(val);
    }
}
