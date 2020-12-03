package person;

import animals.Pet;

public class Person {
    private String name;
    private String surName;
    private Pet pet;

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

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public void callYourPet() {
        System.out.println("Say something!");
        pet.say();
    }
}
