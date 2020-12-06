package main.entryPoint;

import main.animals.Cat;
import main.animals.Pet;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationTest5 {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext3.xml");
        Pet cat = context.getBean("cat", Cat.class);
        cat.say();
        context.close();
    }
}
