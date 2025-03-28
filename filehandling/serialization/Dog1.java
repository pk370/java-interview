package filehandling.serialization;

import java.io.*;

public class Dog1 implements Serializable {
    public int i=78790;
}

class SerializingDog{
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileOutputStream fileOutputStream=new FileOutputStream("dogSave.txt");
        ObjectOutputStream outputStream=new ObjectOutputStream(fileOutputStream);
        outputStream.writeObject(new Dog1());
//        FileInputStream fileInputStream=new FileInputStream("dogSave.txt");
//        ObjectInputStream objectInputStream=new ObjectInputStream(fileInputStream);
//        Dog1 dog1=(Dog1) objectInputStream.readObject();
//        System.out.println(dog1.i);
    }
}