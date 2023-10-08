package ru.tregulov.first.AOP;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class University {
    private List<Student> students = new ArrayList<>();

    public void addStudents() {
        Student st1 = new Student("Vasya Ivanov", 4, 7.5);
        Student st2 = new Student("Andrey Rublyov", 2, 9.5);
        Student st3 = new Student("Igor Ponomarev", 3, 5.5);
        students.add(st1);
        students.add(st2);
        students.add(st3);
    }

    public List<Student> getStudents() {
        System.out.println("Start of method getStudents()");
        System.out.println(students.get(3));
        System.out.println("Information from method getStudents: ");
        System.out.println(students);
        return students;
    }
}
