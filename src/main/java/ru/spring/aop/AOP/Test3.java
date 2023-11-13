package ru.spring.aop.AOP;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test3 {
    public static void main(String[] args) {
        System.out.println("Method main starts");
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);

        SchoolLibrary library = context.getBean("schoolLibrary", SchoolLibrary.class);
        String bookName = library.returnBook();
        System.out.println(bookName);

        context.close();
        System.out.println("Method main ends");
    }
}
