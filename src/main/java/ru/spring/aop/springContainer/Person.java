package ru.spring.aop.springContainer;

import org.springframework.beans.factory.annotation.Value;

//@Component("myPerson")
public class Person {
//    @Autowired
//    @Qualifier("cat")
    private Pet pet;
    @Value("${person.surname}")
    private String surname;
    @Value("${person.age}")
    private int age;

//    @Autowired
//    public Person(@Qualifier("myDog") Pet pet) {
//        this.pet = pet;
//    }

    public Person(Pet pet) {
        this.pet = pet;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

//    public Person() {}

    public void callYourPet() {
        System.out.println("Hello, my pet");
        pet.say();
    }
}
