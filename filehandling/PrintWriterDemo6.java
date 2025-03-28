package filehandling;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterDemo6 {
    public static void main(String[] args) throws IOException {
        FileWriter f=new FileWriter("abc3.txt",true);
        PrintWriter pw=new PrintWriter(f);
        pw.write(99);
        pw.print(true);
        pw.println(78.0);
        pw.println(89);
        pw.flush();
        pw.close();

    }
}
