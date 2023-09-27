package ru.tregulov.first;

import org.springframework.stereotype.Component;

@Component("myDog")
public class Dog implements Pet{

    @Override
    public void say() {
        System.out.println("Bow-Wow");
    }

    public void init() {
        System.out.println("init method");
    }

    public void destroy() {
        System.out.println("destroy method");
    }
}
