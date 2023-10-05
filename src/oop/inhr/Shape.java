package oop.inhr;

public class Shape {
    private int width;
    private int height;
    private int rad;

    public Shape() {
    }

    public Shape(int rad) {
        this.rad = rad;
    }

    public Shape(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public Shape(int width, int height, int rad) {
        this.width = width;
        this.height = height;
        this.rad = rad;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getRad() {
        return rad;
    }

    public void setRad(int rad) {
        this.rad = rad;
    }

    public double getArea(){
        return 0.0;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "width=" + width +
                ", height=" + height +
                ", rad=" + rad +
                '}';
    }

    public String printData() {
        return "Shape{" +
                "width=" + width +
                ", height=" + height +
                ", rad=" + rad +
                '}';
    }
}
