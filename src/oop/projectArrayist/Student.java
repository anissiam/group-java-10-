package oop.projectArrayist;

public class Student {
    private int id;
    private String name;
    private int mark;
    private int age;

    public Student() {
    }

    public Student(int id, String name, int mark, int age) {
        this.id = id;
        this.name = name;
        this.mark = mark;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", mark=" + mark +
                ", age=" + age +
                '}';
    }
}
