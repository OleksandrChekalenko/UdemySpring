package main;

import animals.Cat;
import animals.Dog;
import animals.Pet;

public class Application1 {

    public static void main(String[] args) {
        Pet dog = new Dog();
        dog.say();

        Pet cat = new Cat();
        cat.say();
    }
}
