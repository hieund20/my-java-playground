package oop;

public class Person {

    //Fields
    private String name;

    private int age;

    //Constructor
    public Person() {

    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //Getter and Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //Show information method
    public void introduce() {
        System.out.println("My name is " + this.name + " and my age is " + this.age);
    }
}
