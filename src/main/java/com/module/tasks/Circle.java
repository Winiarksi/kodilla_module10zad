package com.module.tasks;

import org.springframework.stereotype.Component;

//@Component
public class Circle implements Shape {
    @Override
    public String getName() {
        return "Circle";
    }
}
