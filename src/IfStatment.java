import java.util.Scanner;

public class IfStatment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Plz enter your name");
        String name = scanner.nextLine();

        /*if (name.isEmpty()){
            System.out.println("Empty");
            return;

        }*/

        if (!name.isEmpty()){
            if (name.contains("java")){
                System.out.println("your line contains java");
            }else {
                System.out.println("not contains java");
            }
        }



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
