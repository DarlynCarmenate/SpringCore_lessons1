//Конфигурация Spring Container с помощью Java кода

package ru.tregulov.first.springContainer;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test3_javaCode1 {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);
        Person person = context.getBean("myPerson", Person.class);
        person.callYourPet();
        context.close();
    }
}
