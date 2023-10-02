package oop.interfaces.homework;

public class Car {
    private int control;
    private int battary;

    private int speed;

    public Car() {
    }

    public Car(int control, int battary, int speed) {
        this.control = control;
        this.battary = battary;
        this.speed = speed;
    }

    public int getControl() {
        return control;
    }

    public void setControl(int control) {
        this.control = control;
    }

    public int getBattary() {
        return battary;
    }

    public void setBattary(int battary) {
        this.battary = battary;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Car{" +
                "control=" + control +
                ", battary=" + battary +
                ", speed=" + speed +
                '}';
    }
}
