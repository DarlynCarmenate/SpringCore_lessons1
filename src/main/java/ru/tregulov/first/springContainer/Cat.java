package ru.tregulov.first.springContainer;

import org.springframework.stereotype.Component;

//@Component
public class Cat implements Pet{
    @Override
    public void say() {
        System.out.println("Meow-meow");
    }
}
