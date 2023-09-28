package ru.tregulov.first.springContainer;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test4_javaCode2 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig2.class);
//        Pet cat = context.getBean("catBean", Pet.class);
//        cat.say();
        Person person = context.getBean("personBean", Person.class);
        System.out.println(person.getSurname());
        System.out.println(person.getAge());
    }
}
