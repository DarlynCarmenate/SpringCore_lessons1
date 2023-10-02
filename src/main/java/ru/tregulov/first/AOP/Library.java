package ru.tregulov.first.AOP;


import org.springframework.stereotype.Component;

@Component("libraryBean")
public abstract class Library {
    public abstract void getBook();
}
