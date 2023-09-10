package oop.basics;

public class Animal {
    String name  ;
    String type ;
    int age;

    void printData(){
        System.out.println(name + " " + age + " " + type);
    }

    String makeSound(){
        if (type.equalsIgnoreCase("cat")){
            return  "Meow";
        }else {
            return "Woof woof";
        }

    }
}
