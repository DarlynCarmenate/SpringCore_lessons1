package ru.tregulov.first.AOP;

import org.springframework.stereotype.Component;

@Component
public class SchoolLibrary extends Library{
    @Override
    public void getBook() {
        System.out.println("Got a book from school!");
        System.out.println("______________________________________");
    }

    public void getMagazine() {
        System.out.println("Got a magazine from school!");
        System.out.println("______________________________________");
    }

    public void returnBook() {
        System.out.println("Returned a book to college");
        System.out.println("______________________________________");
    }

    public void returnMagazine() {
        System.out.println("Returned a magazine to college");
        System.out.println("______________________________________");
    }

    public void addBook(String person_name, Book book) {
        System.out.println("Added a book to college");
        System.out.println("______________________________________");
    }

    public void addMagazine() {
        System.out.println("Added a magazine to college");
        System.out.println("______________________________________");
    }
}
