package oop;

public class Test {

    public static void main(String[] args) {
        //Basic OOP class
        Person person = new Person("Hieu", 24);
        person.introduce();

        //Inheritance
        Animal animal = new Animal("Animal");
        animal.speak();

        Dog dog = new Dog("Milu");
        dog.speak();

        //Polymorphism
        Shape s1 = new Circle();
        Shape s2 = new Square();

        s1.draw();
        s2.draw();

        //Interface
        IVehicle car = new Car();
        IVehicle bicycle = new Bicycle();

        car.start();
        car.stop();

        System.out.println();

        bicycle.start();
        bicycle.stop();
    }
}
