package oop.interfaces;

public class BMW2023Elec extends Car implements Elec{
    @Override
    public void AI() {
        System.out.println("Not supported AI");
    }

    @Override
    public int battery() {
        return 6;
    }
}
