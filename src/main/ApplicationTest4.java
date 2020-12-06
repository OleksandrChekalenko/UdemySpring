package main;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import person.Person;

public class ApplicationTest4 {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        context.close();
    }
}
