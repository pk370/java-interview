package waysofobjectcreation;

import java.io.*;
import java.text.DateFormat;
import filehandling.serialization.Dog1;
public class ObjectCreate implements Cloneable{
    ObjectCreate objectCreate11;
    int i=324;
    public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException, InstantiationException, IllegalAccessException, CloneNotSupportedException, IOException {
        //1.with new keyword
        ObjectCreate objectCreate=new ObjectCreate();
        //2.with Class.forName method
        ObjectCreate objectCreate1=(ObjectCreate)Class.forName("waysofobjectcreation.ObjectCreate").newInstance();
        //3.By using factory method.
        Runtime runtime=Runtime.getRuntime();
        DateFormat dateFormat=DateFormat.getInstance();
        //4.By using clone method.
        ObjectCreate objectCreate2=new ObjectCreate();
        ObjectCreate objectCreate3=(ObjectCreate)objectCreate2.clone();
        objectCreate3.h();
        //5.By using deserialization.
//        FileOutputStream fileOutputStream=new FileOutputStream("dogSave.txt");
//        ObjectOutputStream outputStream=new ObjectOutputStream(fileOutputStream);
//        outputStream.writeObject(new Dog1());
//        outputStream.flush();
//        outputStream.close();
        FileInputStream fileInputStream=new FileInputStream("dogSave.txt");
        ObjectInputStream objectInputStream=new ObjectInputStream(fileInputStream);
        Dog1 dog1=(Dog1) objectInputStream.readObject();
        System.out.println(dog1.i);

    }
    void h(){
        System.out.println("hello");
    }
}
