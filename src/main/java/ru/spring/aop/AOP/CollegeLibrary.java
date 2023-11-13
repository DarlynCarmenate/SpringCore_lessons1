package ru.spring.aop.AOP;


import org.springframework.stereotype.Component;

@Component
public class CollegeLibrary extends Library{
    @Override
    public void getBook() {
        System.out.println("Got a book from college!");
    }

    public void returnBook() {
        System.out.println("Returned a book to college");
    }
}
