package ru.tregulov.first.AOP;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test1 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);

        Book book = context.getBean("book", Book.class);

        SchoolLibrary schoolLibrary = context.getBean("schoolLibrary", SchoolLibrary.class);
        schoolLibrary.addBook("Darlyn", book);
        schoolLibrary.addMagazine();

//        CollegeLibrary collegeLibrary = context.getBean("collegeLibrary", CollegeLibrary.class);
//        collegeLibrary.getBook();
//        collegeLibrary.returnBook();
//        Library library = context.getBean("libraryBean", Library.class);
//        library.getBook();

        context.close();

    }
}
