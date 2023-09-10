package basics;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Project {
    public static void main(String[] args) {
        String[] names = new String[10];
        int[] marks = new int[10];

        Scanner scanner = new Scanner(System.in);
        int c = 0;
        do {
            System.out.println("1)Show names basics.Arrays\n2)Show marks basics.Arrays\n3)Add Names\n4)Add Marks\n5)Sort Mark Array\n6)Update\n7)Delete\n8)Exit");
            c = scanner.nextInt();
            switch (c){
                case 1:
                    for (int i = 0; i < names.length; i++) {
                        System.out.println(names[i]);
                    }
                    break;

                case 2 :
                    for (int mark:marks) {
                        System.out.println(mark);
                    }
                    break;
                case 3 :
                    scanner.nextLine();
                    for (int i = 0; i < names.length; i++) {
                        System.out.println("Plz enter the name " + (i + 1));
                        names[i] = scanner.nextLine();
                    }
                    break;
                case 4 :
                    scanner.nextLine();
                    for (int i = 0; i < marks.length; i++) {
                        System.out.println("Plz enter the mark " + (i + 1));
                        marks[i] = scanner.nextInt();
                    }
                    break;
                case 5 :
                    Arrays.sort(marks);
                    break;
                case 6 :
                    System.out.println("1)Name\n2)Mark");
                    int cc = scanner.nextInt();
                    switch (cc){
                        case 1:
                            scanner.nextLine();
                            System.out.println("Enter old name");
                            String oldName = scanner.nextLine();
                            for (int i = 0; i < names.length; i++) {
                                if (oldName.equalsIgnoreCase(names[i])) {
                                    System.out.println("Enter new name");
                                    String newName = scanner.nextLine();
                                    names[i] = newName;
                                    System .out.println("Updated");
                                }
                            }
                            break;

                        case 2:
                            scanner.nextLine();
                            System.out.println("Enter old mark");
                            int  oldMark = scanner.nextInt();
                            for (int i = 0; i < marks.length; i++) {
                                if (oldMark==marks[i]) {
                                    System.out.println("Enter new mark");
                                    int newMark = scanner.nextInt();
                                    marks[i] = newMark;
                                    System .out.println("Updated");
                                }
                            }
                            break;
                        default:
                            break;
                    }
                case 7 :
                    System.out.println("1)Name\n2)Mark");
                    int ccc = scanner.nextInt();
                    if (ccc==1){
                        scanner.nextLine();
                        System.out.println("Enter the name");
                        String oldName = scanner.nextLine();
                        for (int i = 0; i < names.length; i++) {
                            if (oldName.equalsIgnoreCase(names[i])) {
                                names[i] = null;
                                System .out.println("Deleted");
                            }
                        }
                    }else if (ccc==2){
                        scanner.nextLine();
                        System.out.println("Enter the mark");
                        int  oldMark = scanner.nextInt();
                        for (int i = 0; i < marks.length; i++) {
                            if (oldMark==marks[i]) {
                                marks[i] = 0;
                                System .out.println("Deleted");
                            }
                        }
                    }else {
                        return;
                    }
                    break;
                default:
                    System.exit(0);

            }
        } while (c <= 8);


    }
}
