package ru.spring.aop.AOP;


import org.springframework.stereotype.Component;

@Component("libraryBean")
public abstract class Library {
    public abstract void getBook();
}
