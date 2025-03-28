package filehandling.serialization;

import javax.swing.text.TabableView;
import java.io.*;
import java.util.List;

class ab{
    int i=8;
    ab(){//here.. the non serializable class should contain no argument constructor when it's child object is serializing.
        //--so when the deserialization happens jvm performs instance controll flow to get the original values of the variables.

    }
}
class ab1 extends ab implements Serializable{
    int j=9;
}
public class InheritanceSerializationDemo5 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ab1 kh=new ab1();
        kh.i=8000;
        kh.j=769;
        FileOutputStream fo=new FileOutputStream("objgraph.txt");
        ObjectOutputStream oo=new ObjectOutputStream(fo);
        oo.writeObject(kh);
        FileInputStream fi=new FileInputStream("objgraph.txt");
        ObjectInputStream oi=new ObjectInputStream(fi);
        ab1 ab1=(ab1) oi.readObject();
        System.out.println(ab1.i+" "+ab1.j);
    }
}
