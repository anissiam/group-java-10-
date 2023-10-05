package oop.projectArrayist;

import java.util.ArrayList;
import java.util.Scanner;

public class Panel {
    private static Scanner scanner = new Scanner(System.in);
    private static ArrayList<Student> studentArrayList = new ArrayList<>();

    public static void addStudent(){

        int id = getId();

        scanner.nextLine();

        System.out.println("Plz enter Name:");
        String name = scanner.nextLine();

        System.out.println("Plz enter age:");
        int age = scanner.nextInt();

        System.out.println("Plz enter mark:");
        int mark = scanner.nextInt();

        Student student = new Student(id, name, mark, age);

        studentArrayList.add(student);

        System.out.println("Student Added");

    }

    public static void getStudentById(){
        int id = getId();

        if (studentArrayList.isEmpty()){
            System.out.println("Room is empty");
            return;
        }
        for(Student student:studentArrayList){
            if (student.getId() == id) {
                System.out.println(student);
                return;
            }
        }
        System.out.println("Student not found");
    }


    public static void getAllStudent() {
        if (studentArrayList.isEmpty()) {
            System.out.println("Room is empty");
            return;
        }

        for (Student student : studentArrayList) {
            System.out.println(student);
        }
    }


    public static void deleteStudent(){
        int id = getId();
        if (studentArrayList.isEmpty()) {
            System.out.println("Room is empty");
            return;
        }

        for(Student student:studentArrayList){
            if (student.getId() == id) {
                studentArrayList.remove(student);
                System.out.println("Deleted");
                return;
            }
        }
        System.out.println("Student not found");

    }





    private static int getId(){
        System.out.println("Plz enter the id:");
        return scanner.nextInt();
    }

}
