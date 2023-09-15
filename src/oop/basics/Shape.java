package oop.basics;

public class Shape {
   private int l , w , r;

    public Shape() {
    }

    public Shape(int l, int w, int r) {
        this.l = l;
        this.w = w;
        this.r = r;
    }


    public void setL(int l){
        this.l = l;
    }
    public int getL(){
        return l;
    }

    public void setR(int r) {
        this.r = r;
    }

    public int getR() {
        return r;
    }

    public int getW() {
        return w;
    }

    public void setW(int w) {
        this.w = w;
    }

    public void printShape(){
        System.out.println("L:" + l + "W:" + w + "R:" + r);
    }
    public double area(){
        if (r!=0){
            return Math.PI * r * r;
        }else {
            return w * l;
        }
    }
}
