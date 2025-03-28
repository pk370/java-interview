package filehandling.serialization;


import java.io.*;

class Animal implements Serializable {
    Cat cat=new Cat();
}
class Cat implements Serializable{
    Rat rat=new Rat();
}
class Rat implements Serializable{
    int i=9;
}
//whenever we are serializing an object, the set of all objects which are reachable from that object will be serialized automatically.
//--this group of objects is nothing but object graph.
public class ObjectGraphDemo2 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileOutputStream fo=new FileOutputStream("objgraph.txt");
        ObjectOutputStream oo=new ObjectOutputStream(fo);
        oo.writeObject(new Animal());
        FileInputStream fi=new FileInputStream("objgraph.txt");
        ObjectInputStream oi=new ObjectInputStream(fi);
        Animal animal=(Animal) oi.readObject();
        System.out.println(animal.cat.rat.i);
        oo.flush();
        oo.close();

    }
}
