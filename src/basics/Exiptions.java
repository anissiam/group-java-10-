package basics;

import oop.basics.Person;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exiptions {
     static Person person;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        try {

            int[] nums = new int[3];
            nums[-1] = 10;
             System.out.println("Plz enter the num");
            int num = scanner.nextInt();//throw InputMismatchException
            System.out.println("My num is " + num);
            person.printData();//trow NullPointerException

        }catch (InputMismatchException e){
            System.out.println(e);
            return;

        } catch (NullPointerException e){
            System.out.println(e);
            person = new Person();
            person.printData();

        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
        finally {
            System.out.println("Finally");

        }

        System.out.println("Done");
    }
}
