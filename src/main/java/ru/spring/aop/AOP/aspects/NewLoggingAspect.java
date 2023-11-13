package ru.spring.aop.AOP.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class NewLoggingAspect {

    @Around("execution(public String returnBook())")
    public Object aroundReturnBookLoggingAdvice(ProceedingJoinPoint proceedingJoinPoint)
            throws Throwable {

        System.out.println("aroundReturnBookLoggingAdvice: trying to return the book" +
                " to the library");

        Object returnBookResult = null;
        try {
            returnBookResult = proceedingJoinPoint.proceed();
        } catch (Exception e) {
            System.out.println("aroundReturnBookLoggingAdvice: exception logged " + e);
            throw e;
        }

        System.out.println("aroundReturnBookLoggingAdvice: the book returned" +
                " to the library");

        return returnBookResult;
    }
}
