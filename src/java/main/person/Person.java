package main.person;

import main.animals.Pet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("personBean")
@Scope("prototype")
public class Person {

    private String surName;

    @Value("Oleksandr")
    private String name;

    //@Autowired
    //@Qualifier("catBean")
    private Pet pet;

//    @Value("${person.age}")
    private int age;

    public Person() {
    }

    @Autowired
    public Person(@Qualifier("dogBean") Pet pet) {
        System.out.println("Person Bean is created.");
        this.pet = pet;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public Pet getPet() {
        return pet;
    }

    //pet -> SetPet (Spring Bean)
    //    @Autowired
    //    @Qualifier("catBean")
    public void setPet(Pet pet) {
        System.out.println("Class Person: set pet");
        this.pet = pet;
    }

    public void callYourPet() {
        System.out.println("Say something!");
        pet.say();
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("Set age: " + age);
        this.age = age;
    }
}
