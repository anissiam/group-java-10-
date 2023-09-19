package oop.abstraction;

import oop.basics.Modifier;

public abstract class Car extends Modifier {
    //private String name;
    private int speed;
    private String color;

    public Car() {
    }

    public Car(String name, int speed, String color) {
        this.name = name;
        this.speed = speed;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract void printSpeed();

    @Override
    public String toString() {
        name = "asda";
        return "Car{" +
                "name='" + name + '\'' +
                ", speed=" + speed +
                ", color='" + color + '\'' +
                '}';
    }
}
