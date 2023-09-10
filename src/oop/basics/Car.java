package oop.basics;

public class Car {
    String model;
    int speed;

    void printSpeed(){

        for (int i = 0; i < speed; i++) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(i);
        }
    }
}
