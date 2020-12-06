package main.animals;

import org.springframework.stereotype.Component;

@Component
public class Cat implements Pet {

    public Cat() {
        System.out.println("Cat Bean is created.");
    }

    @Override
    public void say() {
        System.out.println("Mew - Wew");
    }
}