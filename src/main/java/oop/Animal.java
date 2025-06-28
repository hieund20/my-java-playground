package oop;

public class Animal {

    protected String name;

    public Animal() {

    }

    public Animal(String name) {
        this.name = name;
    }

    public void speak() {
        System.out.println(this.name + " is speaking.");
    }
}
