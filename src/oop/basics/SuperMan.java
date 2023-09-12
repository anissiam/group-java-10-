package oop.basics;

public class SuperMan {
    private String name;
    private String superPower;

    public SuperMan() {
    }

    public SuperMan(String name, String superPower) {
        this.name = name;
        this.superPower = superPower;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setSuperPower(String superPower){
        this.superPower = superPower;
    }
    public String getSuperPower(){
        return superPower;
    }

}
