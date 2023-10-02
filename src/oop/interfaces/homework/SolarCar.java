package oop.interfaces.homework;

public class SolarCar extends Car implements Solor {

    public SolarCar() {
    }

    public SolarCar(int control, int battary, int speed) {
        super(control, battary, speed);
    }


    @Override
    public void chargeable() {
        System.out.println("Chargeable");
    }

    @Override
    public void solarNumber() {
        System.out.println("2");
    }
}
