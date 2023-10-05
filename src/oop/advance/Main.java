package oop.advance;

import oop.inhr.Shape;
import oop.poly.B;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> stringArrayList = new ArrayList<>();
        stringArrayList.add("anis");
        stringArrayList.add("sami");
        stringArrayList.add("ali");
        //stringArrayList.set(1,"mosa");

        System.out.println(stringArrayList);


        //stringArrayList.remove(1);
        //stringArrayList.remove("sami");
        //stringArrayList.clear();

        System.out.println(stringArrayList);
        System.out.println(stringArrayList.contains("anis"));
        System.out.println(stringArrayList.isEmpty());
        Collections.sort(stringArrayList);

        for (int i = 0; i < stringArrayList.size(); i++) {
            System.out.println(stringArrayList.get(i));
        }
        /*for (String s:stringArrayList){
            System.out.println(s);
        }*/
        /*System.out.println(stringArrayList.get(0));
        ArrayList<String> arrayList = new ArrayList<>();*/

        /*arrayList.addAll(stringArrayList);
        arrayList = stringArrayList;*/
       // System.out.println(arrayList);



       /* GClass<String, Integer> integerGClass = new GClass<>();
        integerGClass.print("Hello", 50);*/
        /*GClass<B> bgClass = new GClass<>();
        bgClass.print(new B());*/

       /* GClass<String> stringGClass = new GClass<>();
        stringGClass.print("Hello");*/

        /*GClass<Integer> integerGClass = new GClass<>();
        integerGClass.print(10);


        GClass<Double> doubleGClass = new GClass<>();
        doubleGClass.print(50.6);
        */
        /*GClass<Shape> shapeGClass = new GClass<>();
        Shape shape = new Shape();
        shape.setRad(10);
        shapeGClass.print(shape);*/

        /*IntegerClass integerClass = new IntegerClass();
        integerClass.print(10);


        StringClass stringClass = new StringClass();
        stringClass.print("hello");*/

       /* int x = 10;
        System.out.println(x);


        Integer xy = new Integer(10);

        System.out.println(xy);
        Integer xx = Integer.valueOf(10);
        Integer z = Integer.valueOf("10");
        Integer zz = Integer.parseInt("10");
        System.out.println(zz.doubleValue());
        System.out.println(Integer.max(10, 50));
        System.out.println(Integer.min(20, 50));
        System.out.println(z);
*/
    }
}
