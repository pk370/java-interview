package filehandling.serialization;

import java.io.*;

//By using FileOutPutStream and objectOutPutStream we can achieve serialization.
//the process of converting the java object from java supported form to file supported or network supported form.
public class SerializationDemo1 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileOutputStream fo=new FileOutputStream("abc.txt");//If we want to write the binary data into the file then we should
                                                                  //use fileoutputstream.
                                                                  //binary data means photos, videos and audio files.
        ObjectOutputStream oo=new ObjectOutputStream(fo);//If we want to write the object to the file then we should use objectOutpu
                                                         //-tStream with fileOutputStream reference variable that should passed to
                                                         //the constructor.
        oo.writeObject(new Dog());//It is the way to write the object.
        FileInputStream fi=new FileInputStream("abc.txt");//It is use to read the binary data from the file.
        ObjectInputStream oi=new ObjectInputStream(fi);//It is use to read the object but FIO reference variable is required.
        Dog d=(Dog) oi.readObject();//It is the process of reading the object and type casting is required.
//        Object o=oi.readObject();
        System.out.println(d.name+" "+d.age);
//        System.out.println(o);
        oo.flush();
        oo.close();
    }
}
class Dog implements Serializable{//object's class should implemetns serializable interface to support serialization.
    String name="chimtu";
    transient int age=4; //transient keyword will make the jvm to take the default value for the variable while serialization.
}
