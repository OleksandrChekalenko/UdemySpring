package main.entryPoint;

import main.animals.Cat;
import main.animals.Pet;
import main.person.Person;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConfigWithAnnotation {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext3.xml");
        Person person = context.getBean("personBean", Person.class);
        person.callYourPet();
        System.out.println(person.getName());
        System.out.println(person.getAge());
        context.close();
    }
}
