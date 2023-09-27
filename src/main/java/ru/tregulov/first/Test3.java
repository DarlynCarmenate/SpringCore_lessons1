package ru.tregulov.first;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test3 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext2.xml");
//        Pet pet = context.getBean("myPet", Pet.class);
//        Person person = new Person(pet);
//        Dog dog = context.getBean("myDog", Dog.class);
//        dog.say();
        Person person = context.getBean("myPerson", Person.class);
        person.callYourPet();
//        System.out.println(person.getSurname());
//        System.out.println(person.getAge());
        context.close();
    }
}
