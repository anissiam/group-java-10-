package basics;

import java.util.Date;
import java.util.Scanner;

public class IfStatment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("num");
        int num = scanner.nextInt();

        /*if (num==0){
            System.out.println("0");

        }else if (num==2|| num==3){
            System.out.println("2 Or 3");
        }else {
            System.out.println("any number");
        }
*/


       /* switch (num){
            case 0:
                System.out.println("0");
                break;
            case 2 :
            case 3:
                System.out.println("2 OR 3 ");
                break;
            default:
                System.out.println("any number");

        }*/

        /*System.out.println("Plz enter thr month");
        String month = scanner.nextLine();

        switch (month){
            case "jan" , "Jan":
                System.out.println("1");
                break;

            case "feb":
                System.out.println("2");
                break;
            case "march":
                System.out.println("3");
                break;
            default:
                System.out.println("Not found");
        }*/


        /*System.out.println("Plz enter the num");
        int month = scanner.nextInt();

        switch (month){
            case 1:
                System.out.println("Jan");
                break;
            case 2:
                System.out.println("Feb");
                break;
            case 3 :
                System.out.println("March");
                break;
            default:
                System.out.println("Not found");
                break;
        }*/



        /*System.out.println("Mark");
        int mark = scanner.nextInt();

        switch (mark){
            case 90:
                System.out.println("A+");
                break;
            case 80 :
                System.out.println("B+");
                break;
            case 70:
                System.out.println("C");
                break;
            case 50:
                System.out.println("Passed");
                break;

            default:
                System.out.println("Failed");
                break;

        }*/


        /*int x = 2;
        int y = 5;
        int z = 0;

        System.out.println(x == 2);*/


        /*System.out.println("Plz enter the mark");
        int mark = scanner.nextInt();

        if (mark < 25) {
            System.out.println("F");
        } else if (mark >= 25 && mark <= 45) {
            System.out.println("E");
        } else if (mark>45 && mark<=50){
            System.out.println("D");
        }else if (mark>50 && mark<=60){
            System.out.println("C");
        }else if (mark>60 && mark<=80){
            System.out.println("B");
        }else {
            System.out.println("A");
        }
*/

          /*  int x = 3;
            if (x > 0) {
                System.out.println("x is greater than 0");
            } else{
        System.out.println(" x is less than or equal 0");
    }*/

        /*System.out.println("Plz enter email or URL");
        String s = scanner.nextLine();*/
        /*if (s.isEmpty()){
            System.out.println("Empty");
            return;
        }*/
        /*if (!s.isEmpty()){
            if (s.contains("@")) {
                System.out.println("Email");
            }else if (s.contains("://")){
                System.out.println("URL");
            }else {
                System.out.println("Normal text");
            }
        }else {
            System.out.println("Empty");
        }*/



        /*System.out.println("Plz enter first line");
        String firstLine = scanner.nextLine();

        System.out.println("Plz enter last line");
        String lastLine = scanner.nextLine();

        System.out.println(firstLine.length()  +" " + lastLine.length());*/




        /*System.out.println("Plz enter year");
        String year = scanner.nextLine();

        System.out.println(year.charAt(0));
        System.out.println(year.charAt(1));
        System.out.println(year.charAt(2));
        System.out.println(year.charAt(3));*/



        /*System.out.println("Plz enter the mark");
        int mark = scanner.nextInt();
        if (mark>100||mark<0){
            System.out.println("not valid");
            return;
        }

        if (mark==90){
            System.out.println("E");

        } else if (mark == 80) {
            System.out.println("VG");
        } else if (mark == 70) {
            System.out.println("G");
        } else if (mark==50) {
            System.out.println("Passed");
        } else {
            System.out.println("Failed");
        }
*/

       /* System.out.println("Plz enter the age");
        int age = scanner.nextInt();

        if (age>20){
            scanner.nextLine();
            System.out.println(age);
            System.out.println("Plz enter the name");
            String name = scanner.nextLine();
            if (name.startsWith("a") || name.startsWith("A")){
                System.out.println("start with A");
            }else {
                System.out.println("not start with A");
            }
        }else {
          System.out.println("Not valid");
        }*/



       /* if (num==0){
            System.out.println("not even not odd ");
            return;
        }*/


        /*if (num != 0) {
            if (num % 2 == 0) {
                System.out.println("even");
            } else {
                System.out.println("Odd");
            }

        }else {
            System.out.println("not even not odd ");
        }
*/


        /*if (num==0){
            System.out.println("Zero");
        }else if(num>0){
            System.out.println("+");
        }else {
            System.out.println("-");
        }*/

       /* System.out.println("Plz enter the device");
        String de = scanner.nextLine();

        if (de.isEmpty()){
            System.out.println("Empty");
            return;
        }

        if (de.equalsIgnoreCase("samsung")){
            System.out.println("Android");
        }else if(de.equalsIgnoreCase("Apple")){
            System.out.println("IOS");
        }else {
            System.out.println("IDk");
        }*/

       /* Scanner scanner = new Scanner(System.in);
        System.out.println("Plz enter your name");
        String name = scanner.nextLine();

        *//*if (name.isEmpty()){
            System.out.println("Empty");
            return;

        }*//*

        if (!name.isEmpty()){
            if (name.contains("java")){
                System.out.println("your line contains java");
            }else {
                System.out.println("not contains java");
            }
        }
*/


        /*System.out.println("Plz enter the num");

        int num = scanner.nextInt();


        if (num > 100 || num < 0) {
            System.out.println("Not valid");
            return;
        }


        if (num>=50){
            System.out.println("Passed");
            if (num>=90){
                System.out.println("A+");
            }
        }else {
            System.out.println("Failed");
        }
*/
        /*if (num>=0){
            System.out.println("number is bigger or eqals then 0");
        }else {
            System.out.println("Less than 0");
        }*/
       /* if (num<0){
            System.out.println("Less than 0");
        }*/


    }
}
