package person;

import animals.Pet;

public class Person {
    private String name;
    private String surName;
    private Pet pet;
    private int age;

    public Person() {
    }

    public Person(Pet pet) {
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
