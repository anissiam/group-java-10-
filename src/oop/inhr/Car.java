package oop.inhr;

public class Car {
    String name ;
    String model ;
    int speed;

    public void printSpeed(){
        for (int i = 0; i < speed; i++) {
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(i);
        }
    }
}
