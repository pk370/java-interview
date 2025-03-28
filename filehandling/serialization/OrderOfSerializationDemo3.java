package filehandling.serialization;

import javax.sound.midi.Soundbank;
import java.io.*;

class A implements Serializable{
    int a=1;
}
class B implements Serializable{
    int b=2;
}
class C implements Serializable{
    int c=3;
}
public class OrderOfSerializationDemo3 {
    public static void main(String[] args) throws IOException, ClassNotFoundException,EOFException {
        FileOutputStream fo=new FileOutputStream("objgraph.txt");
        ObjectOutputStream oo=new ObjectOutputStream(fo);
        oo.writeObject(new A());
        oo.writeObject(new B());
        oo.writeObject(new C());
        oo.flush();
        oo.close();
        FileInputStream fi=new FileInputStream("objgraph.txt");
        ObjectInputStream oi=new ObjectInputStream(fi);
        //we should deserialize the objects in the same serialized order of the objects.
        //But If we do not know the order of serialization of objects then we can go for while loop by using instance method.
        Object o=oi.readObject();
        while (o!=null) {
            if (o instanceof A) {
                A obj1 = (A) o;
                System.out.println(obj1.a);
            } else if (o instanceof B) {
                B obj2 = (B) o;
                System.out.println(obj2.b);
            } else {
                C obj3 = (C) o;
                System.out.println(obj3.c);
            }
            System.out.println("hello");
            try {
                o = oi.readObject();
            }
            catch (Exception e){
                o=null;
            }

            System.out.println(o);
        }
        System.out.println("finally");
    }
}
