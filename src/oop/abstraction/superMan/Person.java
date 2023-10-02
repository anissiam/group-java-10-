package oop.abstraction.superMan;

public abstract class Person {
    private String name;
    private int age;
    private int tall;

    public Person() {
    }

    public Person(String name, int age, int tall) {
        this.name = name;
        this.age = age;
        this.tall = tall;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getTall() {
        return tall;
    }

    public void setTall(int tall) {
        this.tall = tall;
    }

    public abstract void printHero();

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", tall=" + tall +
                '}';
    }
}
