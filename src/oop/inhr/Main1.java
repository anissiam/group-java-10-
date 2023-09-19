package oop.inhr;

public class Main1 {
    public static void main(String[] args) {
        Squre squre = new Squre(10, 10);
        System.out.println(squre.getArea());


        Circle circle = new Circle(10);
        circle.setRad(3);
        System.out.println(circle.getArea());

    }
}
