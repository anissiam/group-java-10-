package oop.poly;

public class Main {
    public static void main(String[] args) {
        /*A a = new A();
        a.printClassName();
        B b = new B();
        b.printClassName();
        C c = new C();
        c.printClassName();*/

        /*A b = new B();
        b.printClassName();
        A c = new C();
        c.printClassName();
*/
       /* B b = new B();
        poly(b);
        poly(new C());*/

        Test add = new Additon();

        Poly poly = new Poly();
        poly.poly(new Sub(), 10, 80);
    }

    private static void poly(A a){
        a.printClassName();
    }
}
