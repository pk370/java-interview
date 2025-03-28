package filehandling.serialization;

import java.io.*;
//In Serialization we should add all the properties of the object in the file but in externalization we can add one or more properties
//--in the file.
//In serialization, jvm has the all control and the class implements Serializable..a marker interface.
//In externalization, we have all the control and the class should implements Externalizable interface.
public class ExternalizationDemo6 implements Externalizable{
    transient String i;transient int j;transient int k;
    public ExternalizationDemo6(){
        System.out.println("i was called");
    }
    public ExternalizationDemo6(String i,int j,int k){
        this.i=i;
        this.j=j;
        this.k=k;
    }
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileOutputStream fo=new FileOutputStream("abc.ser");
        ObjectOutputStream oo=new ObjectOutputStream(fo);
        oo.writeObject(new ExternalizationDemo6("pavan",5,6));
        FileInputStream fi=new FileInputStream("abc.ser");
        ObjectInputStream oi=new ObjectInputStream(fi);
        ExternalizationDemo6 externalizationDemo6=(ExternalizationDemo6) oi.readObject();
        System.out.println(externalizationDemo6.i+" "+externalizationDemo6.j+" "+externalizationDemo6.k);
    }


    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeInt(j);
        out.writeInt(k);
    }

    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        j=in.readInt();
        k=in.readInt();
    }
}
