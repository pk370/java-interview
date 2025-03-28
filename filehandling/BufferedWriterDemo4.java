package filehandling;

import java.io.*;

public class BufferedWriterDemo4 {
    public static void main(String[] args) throws IOException {
        FileWriter f=new FileWriter("abc3.txt",true);
        BufferedWriter b=new BufferedWriter(f);
        b.write(45);
        b.newLine();
        char c[]={'f','t','y'};
        b.write(c);
        b.newLine();
        b.write("hello pavan");
        b.flush();
        b.close();

    }
}
