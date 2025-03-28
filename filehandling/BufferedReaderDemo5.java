package filehandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderDemo5 {
    public static void main(String[] args) throws IOException {
        FileReader f=new FileReader("abc3.txt");
        BufferedReader b=new BufferedReader(f);
        String h=b.readLine();
        System.out.println(h);
        System.out.println(b.read());
        char c[]=new char[10];
        b.read(c);
        System.out.println("hello");
        for(char m:c){
            System.out.print(m);
        }
        System.out.println("array ended");
        h=b.readLine();
        while(h!=null){
            System.out.println(h);
            h=b.readLine();
        }
        b.close();
    }
}
