package oop.interfaces.homework;

public class Main {
    public static void main(String[] args) {
        SolarCar solarCar = new SolarCar(200, 4, 40);
        System.out.println(solarCar);
        solarCar.chargeable();
        solarCar.solarNumber();

    }
}
