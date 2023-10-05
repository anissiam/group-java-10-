package oop.projectArrayist;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        int c;
        do {

            System.out.println();
            System.out.println("====================================================================");
            System.out.println("1-Add Student\n2-Show Student\n3-Show All Student\n4-Update Student\n" + "5-Delete Student\n6-Order Student by Age\n7-Get all Success student");
            c = scanner.nextInt();
            switch (c) {
                case 1:
                    Panel.addStudent();
                    break;
                case 2:
                    Panel.getStudentById();
                    break;
                case 3:
                    Panel.getAllStudent();
                    break;
                case 4:
                    break;
                case 5:
                    Panel.deleteStudent();
                    break;
                case 6:
                    break;
                case 7:
                    break;

            }
        } while (c < 8);
    }
}
