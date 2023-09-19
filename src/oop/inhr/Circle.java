package oop.inhr;

public class Circle extends Shape {

    public Circle() {
    }

    public Circle(int rad) {
        super(rad);
    }

    @Override
    public double getArea() {
        return 3.14 * (getRad() * getRad());
    }

    /*public void area(){
        System.out.println(3.14 * (getRad() * getRad()));
    }*/
}
