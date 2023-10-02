package ru.tregulov.first.AOP;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("ru.tregulov.first.AOP")
@EnableAspectJAutoProxy
public class MyConfig {
}
