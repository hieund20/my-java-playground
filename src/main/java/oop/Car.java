package oop;

public class Car implements IVehicle{

    @Override
    public void start() {
        System.out.println("Car is started by key.");
    }

    @Override
    public void stop() {
        System.out.println("Car is stop by brake.");
    }
}
