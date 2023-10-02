package oop.interfaces.pc;

public class Main {
    public static void main(String[] args) {
        HP hp = new HP(8, "i7", "3090", 1);
        System.out.println(hp.toString());


        HPWater hpWater = new HPWater(8, "i7", "3090", 1);
        if (hpWater.isClose()){
            System.out.println("Closed");
        }else {
            System.out.println("OPEN");
        }
        System.out.println(hpWater.tubes()+"M");
        hpWater.tankSize();
        System.out.println(hpWater.toString());
        hpWater.RGBColor();

    }
}
