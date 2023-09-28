package ru.tregulov.first.springContainer;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//@Component("myDog")
public class Dog implements Pet{

    @Override
    public void say() {
        System.out.println("Bow-Wow");
    }

    @PostConstruct
    public void init() {
        System.out.println("init method");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("destroy method");
    }
}
