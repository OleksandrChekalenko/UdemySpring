package main;

import animals.Dog;
import animals.Pet;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationTest {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        Pet dog = new Dog();
        dog.say();
        context.close();
    }
}
