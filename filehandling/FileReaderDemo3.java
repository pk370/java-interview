package filehandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo3 {
    public static void main(String[] args) throws IOException {
        File f=new File("pk1401-1.txt");
        f.createNewFile();
        FileReader f2=new FileReader("pk1401-1.txt");//It will not create the file. If we want to read the file then we
                                                             //should use FileReader.
        int k=f2.read();//It will read a single character from the file and returns unicode of the character. If there is no
                        //character then it will simply returns -1.
        //**If we want to get all the characters from the file.
//        while(k!=-1){             //It was commented for the below foreach loop.
//            System.out.println((char)k);
//            k=f2.read();
//        }
        //If we want to read all the characters from the file at a time then we should create the char array with the size of number of
        // characters presented in the file.
        //If we  create the array with low size then we get only the characters that is equal to size.
        //If we  create the array with more size then the file length, then we get all the elements from the file but memory will be
        //wasted.
        char b[]=new char[(int)f.length()];//we should declare array like this to get all the elements from the file.
        int m=f2.read(b);//this method will read all the characters from the file and insert those characters into the array
                         //and returns the number of elements presented in the array not the size.
        System.out.println(m);
        //All the characters have been read in the above while loop if if we want to get the cahracters again comment the above
        //while loop.
        for(char d:b){
            System.out.print(d);
        }
    }
}
