package oop.files;

import java.io.*;

public class Main {
    public static void main(String[] args) {

        File file = new File("hello2.txt");
        //File file = new File("hello1.txt");
        //File file = new File("hello.txt");
        //file.delete();
        //System.out.println(file.getAbsoluteFile());
       /* file.canRead();
        file.canWrite();*/
        /*file.isFile();
        file.isDirectory();*/
        if (!file.exists()){
            try {
                file.createNewFile();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }


        /*char[] c = {'a', 'n', 'i', 's'};

        try {
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write("Hello from java class\n");
            fileWriter.write(80);
            fileWriter.write(c);
            fileWriter.write('W');
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }*/

        /*try {
            FileReader fileReader = new FileReader(file);
            int c = fileReader.read();
            while (c!=-1){
                System.out.print((char) c);
                c = fileReader.read();
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }*/

       /* try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            fileOutputStream.write("My name is anis".getBytes());
            fileOutputStream.close();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }*/


        /*try {
            FileInputStream fileInputStream = new FileInputStream(file);
            int c = fileInputStream.read();
            while (c!=-1){
                System.out.print((char) c);
                c = fileInputStream.read();
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }*/

        /*Student student = new Student("sami", 1, 80.5);


        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(student);
            objectOutputStream.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
*/

        try {
            FileInputStream fileInputStream = new FileInputStream(file);

            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            Student student =(Student) objectInputStream.readObject();
            student.printData();

        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
