package main.entryPoint;

import main.animals.Cat;
import main.animals.Dog;
import main.animals.Pet;

public class ApplicationTest1 {

    public static void main(String[] args) {
        Pet dog = new Dog();
        dog.say();

        Pet cat = new Cat();
        cat.say();
    }
}
