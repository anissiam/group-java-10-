package basics;

import java.util.Arrays;
import java.util.Scanner;

public class ProjectMethods {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        menu();

    }

    private static void menu() {
        String[] names = new String[10];
        int[] marks = new int[10];


        int c = 0;
        do {
            System.out.println("1)Show names basics.Arrays\n2)Show marks basics.Arrays\n3)Add Names\n4)Add Marks\n5)Sort Mark Array\n6)Update\n7)Delete\n8)Exit");
            c = scanner.nextInt();
            switch (c){
                case 1:
                    showName(names);
                    break;
                case 2 :
                    showMark(marks);
                    break;
                case 3 :
                    scanner.nextLine();
                    addNames(names);
                    break;
                case 4 :
                    scanner.nextLine();
                    addMark(marks);
                    break;
                case 5 :
                    Arrays.sort(marks);
                    break;
                case 6 :
                    update(names, marks);
                    break;
                case 7 :
                    if (delete(names, marks)) return;
                    break;
                default:
                    System.exit(0);

            }
        } while (c <= 8);
    }

    private static boolean delete(String[] names, int[] marks) {
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
                if (oldMark== marks[i]) {
                    marks[i] = 0;
                    System .out.println("Deleted");
                }
            }
        }else {
            return true;
        }
        return false;
    }

    private static void update(String[] names, int[] marks) {
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
                    if (oldMark== marks[i]) {
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
    }

    static void showMark(int [] marks){
        for (int mark:marks) {
            System.out.println(mark);
        }
    }

    private static void showName(String[] names) {
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }

    static void addNames(String [] names ) {
        for (int i = 0; i < names.length; i++) {
            System.out.println("Plz enter the name " + (i + 1));
            names[i] = scanner.nextLine();
        }
    }

    static void addMark(int [] marks){
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Plz enter the mark " + (i + 1));
            marks[i] = scanner.nextInt();
        }
    }
}
