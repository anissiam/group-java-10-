import java.util.Date;
import java.util.Scanner;

public class IfStatment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Plz enter the mark");
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
