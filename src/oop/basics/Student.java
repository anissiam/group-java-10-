package oop.basics;

public class Student {
    String name  ;
    int id ;
    double ava;

    public Student(){
        System.out.println("start");
    }

    public Student(String name , int id , double ava){
        this.name = name;
        this.ava = ava;
        this.id = id;
    }

    public Student(String name , int id ){
        this.name = name;
        this.id = id;
    }


    void printData(){
        System.out.println("Name " + name + " id " + id + " ava " + ava);
    }

    void getGrade(){
        if (ava>=50){
            System.out.println("Success");
        }else {
            System.out.println("Failed");
        }
    }
}
