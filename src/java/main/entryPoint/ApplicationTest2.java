package main.entryPoint;

import main.animals.Pet;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationTest2 {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Pet pet = context.getBean("myPet", Pet.class);
        pet.say();

        context.close();
    }
}
