package ru.spring.aop.AOP.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import ru.spring.aop.AOP.Book;

@Component
@Aspect
@Order(1)
public class LoggingAspect {

    @Before("ru.spring.aop.AOP.aspects.MyPointcuts.allAddMethods()")
    public void beforeAddLoggingAdvice(JoinPoint joinPoint) {
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        System.out.println("methodSignarure = " + methodSignature);
        System.out.println("getMethod = " + methodSignature.getMethod());
        System.out.println("getReturnType = " + methodSignature.getReturnType());
        System.out.println("getName = " + methodSignature.getName());

        if(methodSignature.getName().equals("addBook")) {
            Object[] arguments = joinPoint.getArgs();
            for(Object o : arguments) {
                if(o instanceof Book) {
                    Book myBook = (Book) o;
                    System.out.println("name - " + myBook.getName() + "\n author - " +
                            myBook.getAuthor() + "\n year - " + myBook.getYear());
                } else if(o instanceof String)
                    System.out.println("The book added by - " + o);
            }
        }
        System.out.println("BeforeGettingBookAdvice: Trying to get a book/magazine");
        System.out.println("______________________________________");
    }
}
