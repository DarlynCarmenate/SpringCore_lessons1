//конфигурация с помощью xml-файла

package ru.spring.aop.springContainer;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1_applicationContext1 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        Pet pet = context.getBean("myPet", Pet.class);
        pet.say();

        context.close();
    }
}
