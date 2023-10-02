package oop.abstraction.superMan;

public class SuperMan extends Person{
    public SuperMan() {
    }

    public SuperMan(String name, int age, int tall) {
        super(name, age, tall);
    }

    @Override
    public void printHero() {
        System.out.println("Super man can fly");
    }
}
