package main.animals;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//@Component("catBean")
public class Cat implements Pet {

    public Cat() {
        System.out.println("Cat Bean is created.");
    }

    public void say() {
        System.out.println("Mew - Wew");
    }

    @PostConstruct
    public void init() {
        System.out.println("Class Cat: init method");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Class Cat: destroy method");
    }

}
