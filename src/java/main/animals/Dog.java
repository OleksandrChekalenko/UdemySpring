package main.animals;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component("dogBean")
@Scope("singleton") //singltone default
public class Dog implements Pet {

    public Dog() {
        System.out.println("Dog Bean is created.");
    }

    public void say() {
        System.out.println("Bou - Wou");
    }

    public void init() {
        System.out.println("Class Dog: init method");
    }

    public void destroy() {
        System.out.println("Class Dog: destroy method");
    }
}
