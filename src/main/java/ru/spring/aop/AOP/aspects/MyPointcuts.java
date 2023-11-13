package ru.spring.aop.AOP.aspects;

import org.aspectj.lang.annotation.Pointcut;

public class MyPointcuts {

    @Pointcut("execution(* add*(..))")
    protected void allAddMethods() {}
}
