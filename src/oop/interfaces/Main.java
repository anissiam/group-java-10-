package oop.interfaces;

public class Main {
    public static void main(String[] args) {
        BMW2022 bmw2022 = new BMW2022();
        bmw2022.name = "bmw";
        bmw2022.color = "red";
        bmw2022.speed = 200;


        BMWElec elec = new BMWElec();
        elec.AI();

        BMW2023Elec bmw2023Elec = new BMW2023Elec();
        bmw2023Elec.AI();

    }
}
