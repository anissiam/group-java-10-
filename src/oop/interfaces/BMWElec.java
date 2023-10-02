package oop.interfaces;

public class BMWElec extends Car implements Elec{


    @Override
    public void AI() {
        System.out.println("AI Supported");
    }

    @Override
    public int battery() {
        return 5;
    }
}
