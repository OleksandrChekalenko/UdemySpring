package main.entryPoint;

import main.animals.Cat;
import main.animals.Dog;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ScopeTest {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext3.xml");

        Dog dog = context.getBean("dogBean", Dog.class);
        dog.say();

        Cat cat = context.getBean("catBean", Cat.class);
        cat.say();

        context.close();
    }
}
