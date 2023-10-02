package ru.tregulov.first.AOP.aspects;


import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(2)
public class SecurityAspect {

//    @Pointcut("execution(* ru.tregulov.first.AOP.SchoolLibrary.*(..))")
//    private void allMethodsFromSchoolLibrary() {}
//
//    @Pointcut("execution(public void getMagazine())")
//    private void getMagazineFromSchool() {}
//
//    @Pointcut("allMethodsFromSchoolLibrary() && !getMagazineFromSchool()")
//    private void returnAllExceptGetMagazine() {}
//
//    @Before("returnAllExceptGetMagazine()")
//    public void beforeAllMethodsExceptGetMagazine() {
//        System.out.println("beforeAllMethodsExceptGetMagazine: writing log#10");
//    }

//    @Pointcut("execution(* ru.tregulov.first.AOP.SchoolLibrary.get*())")
//    private void allGetMethodsFromSchoolLibrary() {}
//
//    @Pointcut("execution(* return*())")
//    private void allReturnMethodsFromSchoolLibrary() {}
//
//    @Pointcut("allGetMethodsFromSchoolLibrary() || allReturnMethodsFromSchoolLibrary()")
//    private void allGetAndReturnMethodsFromCollegeLibrary() {}
//
//    @Before("allGetMethodsFromSchoolLibrary()")
//    public void beforeGetLoggingAdvice() {
//        System.out.println("beforeGetLoggingAdvice: writing Log#1");
//    }
//
//    @Before("allReturnMethodsFromSchoolLibrary()")
//    public void beforeReturnLoggingAdvice() {
//        System.out.println("beforeReturnLoggingAdvice: writing Log#2");
//    }
//
//    @Before("allGetAndReturnMethodsFromCollegeLibrary()")
//    public void beforeGetAndReturnLoggingAdvice() {
//        System.out.println("beforeGetLoggingAdvice: writing Log#3");
//    }

    @Before("ru.tregulov.first.AOP.aspects.MyPointcuts.allAddMethods()")
    public void beforeAddSecurityAdvice() {
        System.out.println("beforeGetSecurityAdvice: checking rights for getting a book/magazine");
        System.out.println("______________________________________");
    }


//    @Before("execution(public void get*())")
//    public void beforeGettingBookAdvice() {
//        System.out.println("BeforeGettingBookAdvice: Trying to get smth");
//    }

//    @Before("execution(public void ru.tregulov.first.AOP.CollegeLibrary.getBook())")
//    public void beforeGettingBookAdvice() {
//        System.out.println("BeforeGettingBookAdvice: Trying to get a book");
//    }
}
