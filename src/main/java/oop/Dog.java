package oop;

public class Dog extends Animal {

    public Dog() {

    }

    public Dog(String name) {
        super(name);
    }

    @Override
    public void speak() {
        System.out.println(this.name + " is barking: Gau gau!");
    }
}
