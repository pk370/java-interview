package filehandling;

import java.io.File;
import java.io.IOException;

public class FileDemo1 {
    public static void main(String[] args) throws IOException {
        File f=new File("pk1401.txt");//It will not create file.
        f.createNewFile();//It will create the file;
        System.out.println(f.getAbsolutePath());
        System.out.println(f.exists());
        System.out.println(f.isFile());//It will check whether it is a file or not;
        System.out.println(f.isDirectory());//It will check whether it is a Directory or not;
        System.out.println(f.length());
        System.out.println(f.delete());//it will delete the file.
        f.list();//It will return all the files in the directory.
        System.out.println();
    }
}
class FileDemoCreateDir{
    public static void main(String[] args) {
        File f=new File("dire1");
        f.mkdir();
        System.out.println(f.exists());
    }
}
class FileDemoCreateFileInDir{
    public static void main(String[] args) throws IOException{
        File f=new File("C:\\Users\\pavan\\Desktop\\javaConcepts","kkk1401");
        f.createNewFile();
        System.out.println(f.getAbsolutePath());
        System.out.println(f.exists());
    }
}
