import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {

        int s = sum1(10, 20, 30)/3;
        System.out.println(s);
       // div();
        //multiple(10,50);
        /*Scanner scanner = new Scanner(System.in);
        System.out.println("plz enter the name");
        String name = scanner.nextLine();

        System.out.println("plz enter the age");
        int age = scanner.nextInt();

        printNameAndAge(name, age);*/
        /*String s1 = "Anis";
        String s2 = "sami";

        concat(s1, s2);*/
        /*Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();

        int y = scanner.nextInt();

        sum(x,y);
        sub(x, y);*/


    }

    static void sum(int c , int v){

        System.out.println(c + v);
    }


    static void sub(int x, int y) {

        System.out.println(x - y);
    }

    static void concat(String s1 , String s2){
        System.out.println(s1 +" "+ s2);
    }

    static void printNameAndAge(String name, int age) {
        System.out.println("My name is " + name + " my age is " + age);
    }


    static void multiple(int x, int y) {
        System.out.println(x* y);
    }
    static void div(){
        int x = 10;
        int c = 50;
        if (c==0){
            System.out.println("not valid");
            return;
        }
        System.out.println(x/c);

    }

    static int sum1(int x, int y, int z) {
        int result = x + y + z;
        return result;
    }
}
