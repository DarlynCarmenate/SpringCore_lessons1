package ru.spring.aop.springContainer;

//@Component
public class Cat implements Pet{
    @Override
    public void say() {
        System.out.println("Meow-meow");
    }
}
