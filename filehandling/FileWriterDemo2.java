package filehandling;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo2 {
    public static void main(String[] args) throws IOException {
        FileWriter f=new FileWriter("abc1.txt");//It will create a file if we do not have the specified file.
        FileWriter f1=new FileWriter("abc1",true);//By default all the info on the page will be deleted and the new info will be
                                                                // --replaced.If we pass true then the new info will append to the old info.
        f.write(" hello navin\nhello thanish\n");//(\n)should be used to write the info on the new line.
        f.write(98);//It will take the number and print the character.
        char a[]={'m','t'};
        f.write(a);
        f.flush();
        f.close();
    }
}
