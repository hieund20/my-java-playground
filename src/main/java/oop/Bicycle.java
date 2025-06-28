package oop;

public class Bicycle implements IVehicle{

    @Override
    public void start() {
        System.out.println("Car is started by pedal.");
    }

    @Override
    public void stop() {
        System.out.println("Car is started by hand brake.");
    }
}
