package filehandling.serialization;

import java.io.*;

class Account implements Serializable{
    String userName="pavan";
    transient String password="pavan";
    private void writeObject(ObjectOutputStream oo) throws IOException {
        oo.defaultWriteObject();
        String ewd="123"+password;
        oo.writeObject(ewd);
    }
    private void readObject(ObjectInputStream oi) throws IOException, ClassNotFoundException {
        oi.defaultReadObject();
        String m=(String) oi.readObject();
        password=m.substring(3);
    }
}
public class CustomizedSerializationDemo4 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileOutputStream fo=new FileOutputStream("objgraph.txt");
        ObjectOutputStream oo=new ObjectOutputStream(fo);
        oo.writeObject(new Account());
        FileInputStream fi=new FileInputStream("objgraph.txt");
        ObjectInputStream oi=new ObjectInputStream(fi);
        Account account=(Account) oi.readObject();
        System.out.println(account.userName+" "+account.password);

    }
}
