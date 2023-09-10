package basics;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*for (int i = 1; i < 4; i++) {
            for (int j = 1; j < 11; j++) {
                System.out.println(i + "*" + j + " = " + (i * j));
            }
        }*/
        /*int num;
        for (;;) {
            System.out.println("plz enter the num");
             num = scanner.nextInt();
             if (num==0){
                 System.out.println("Zero");
                 continue;
             }
             if(num%2==0){
                 System.out.println(num + " is Even");
             }else {
                 System.out.println(num + " is Odd");

             }
        }*/
       /* System.out.println("Plz enter the name");
        String name = scanner.nextLine();
        for (;;) {
            if (name.equalsIgnoreCase("stop")){
                System.out.println("Stopped");
                break;
            }
            System.out.println("Plz enter the new name");
            name = scanner.nextLine();
        }*/
        /*for (int i = 0; i < 10; i++) {
            if (i==9){
                System.out.print("1/" + i);
            }else {
                System.out.print("1/" + i + " + ");

            }
        }*/
       /* for ( int x = 100;x>=0;--x ){
            System.out.println(x);
        }
        */
        for (int i = 0; i < 4; i++) {
            System.out.println("Week:" + (i + 1));
            for (int j = 0; j < 7; j++) {
                System.out.print("Day" + (j + 1) + " ");
            }
            System.out.println();
        }
        /*for (int i = 0; i < 10; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }*/

        /*for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }*/






        /*System.out.println("Enter the num ");
        int num = scanner.nextInt();
        int i = 1;
        while (i <= 12) {
            System.out.println(num + "*" + i + "=" + (num * i));
            i++;
        }*/
        /*int i = 0;
        int sum = 0;
        while (i<5){
            System.out.println("Enter the num ");
            int num = scanner.nextInt();
            sum += num;
            i++;
        }
        System.out.println(sum / 5);
*/

        /*System.out.println("Enter the num ");
        int num = scanner.nextInt();
        int i = 1;
        int fact = 1;
        while (i<=num){
            fact *= i;
            i++;
        }
        System.out.println(fact);*/

        /*int i = 0;
        int sum = 0;
        while (i<=100){
            sum += i;
            i++;
        }
        System.out.println(sum);*/

/*
        int i = 0;
        for (;;){
            System.out.println(i);
            i++;
        }*/
        /*for (int i = 0; i < 100; System.out.println(i)) {
            i+=2;

            *//*if (i%2==0){
                System.out.println(i);
            }*//*
        }*/

        /*int sum = 0;
        for (int i = 0; i<10 ;i++) {
            sum += i;
        }
        System.out.println(sum);*/


        /*int i = 5;
        do {
            System.out.println("Hello");
        } while (i != 5);*/

        /*int i = 5;
        while (i!=5){
            System.out.println("Hello");

        }*/

        /*int i = 0;
        int max = 0;
        int min = 0;
        while (i < 5) {
            System.out.println("plz enter the num ");
            int num = scanner.nextInt();
            if (max<num){
                max = num;
            }
            if (i == 0) {
                min = num;
            }

            if (min>num){
                min = num;
            }
            i++;
        }
        System.out.println("Max is " +max);
        System.out.println("Min is "+ min);*/



        /*System.out.println("Plz enter any word");
        String text = scanner.nextLine();
        int i = 0;
        while (i < text.length()) {
            System.out.println(text.charAt(i));
            i++;
        }*/
/*
        while (true){
            System.out.println("Enter the mark");
            int mark = scanner.nextInt();
            if (mark<0 || mark>100){
                System.out.println("Not valid ");
                continue;
            }
           *//* System.out.println("Enter the new mark");
             mark = scanner.nextInt();*//*

        }*/

        /*int i = 1;
        int fact = 1;
        while (i <= 7) {
            fact *= i;
            i++;
        }
        System.out.println(fact);*/


       /* int i = 7;
        int fact = 1;
        while (i>0){
            fact *= i;
            i--;
        }

        System.out.println("Fact is " + fact);
*/


        //Scanner scanner = new Scanner(System.in);
        /*int i = 0;
        while (i<5){
            i++;
            if (i==3){
                continue;
            }
            System.out.println(i);
        }*/

        /*System.out.println("plz enter the text");
        String text = scanner.nextLine();
*/

        /*while (!text.equalsIgnoreCase("stop")){
            System.out.println("plz enter the new text");
            text = scanner.nextLine();
        }*/



       /* while (true) {

            if (text.equalsIgnoreCase("stop")) {
                System.out.println("Stopped");
                break;
            }
            System.out.println("plz enter the new text");
            text = scanner.nextLine();

        }*/



        /*int i = 0;
        int sum = 0;
        while (i <= 100) {
            sum += i;
            i++;
        }
        System.out.println(sum);*/


        /*int i = 0;
        while (i < 100) {
            *//*if (i % 2 != 0) {
                System.out.println(i);
            }*//*
            System.out.println(i+1);

            i += 2;

        }
*/
        /*int i = 0;
        while (i<100){

            i += 2;

            System.out.println(i);
           *//*if (i%2==0 ){
               System.out.println(i);
           }*//*


        }*/



     /*                               //i
        System.out.println("Hello");//0
        System.out.println("Hello");//1
        System.out.println("Hello");//2
        System.out.println("Hello");//3
        System.out.println("Hello");//4*/

        /*int i = 100;
        while (i>=0){
            System.out.println(i);
            i--;
        }*/

        /*int i = 0;
        while (i<=100){
            System.out.println(i);
            i++;
        }*/

       /* int i = 0;
        while (i<=4){
            System.out.println(i);
            i++;
        }*/


    }
}
