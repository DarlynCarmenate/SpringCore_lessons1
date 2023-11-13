//использование конфигурации с помощью Java

package ru.spring.aop.springContainer;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("ru.tregulov.first.springContainer")
public class MyConfig {
}
