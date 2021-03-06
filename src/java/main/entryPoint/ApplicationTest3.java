package main.entryPoint;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import main.person.Person;

public class ApplicationTest3 {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//        Pet pet = context.getBean("myPet", Pet.class);
//        Pet pet = new Cat();
//        Person main.person = new Person(pet);
        Person person = context.getBean("myPerson", Person.class);
        person.callYourPet();
        System.out.println(person.getAge());
        context.close();
    }
}
