package oop.homework;

public class Circle {
  private double rad = 1.0;
    private String color = "red";

    public Circle() {
    }

    public Circle(double rad) {
        this.rad = rad;
    }

    public double getRad() {
        return rad;
    }

    public double getArea(){
        return 3.14 * (rad * rad);
    }

}
