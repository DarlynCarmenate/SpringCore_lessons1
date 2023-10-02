package ru.tregulov.first.AOP.aspects;

import org.aspectj.lang.annotation.Pointcut;

public class MyPointcuts {

    @Pointcut("execution(* add*(..))")
    protected void allAddMethods() {}
}
