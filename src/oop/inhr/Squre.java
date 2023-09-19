package oop.inhr;

public class Squre extends Shape{
    public Squre() {
    }

    public Squre(int width, int height) {
        super(width, height);
    }

    @Override
    public double getArea() {
        return getWidth() * getHeight();
    }
    /* public void area(){
        System.out.println(getWidth() * getHeight());
    }*/
}
