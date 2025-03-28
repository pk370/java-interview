package simple;

import java.util.ArrayList;

public class Student extends Student2 {
    Student(){

    }
    static void m(){
        System.out.println("child class static method");
    }
    void k(){
        System.out.println("child class normal method");
    }

    public static void main(String[] args) {
        Student2 s1=new Student2();
        Student2 s2=new Student();
        Student s3=new Student();
        s1.k();
        s1.m();
        s2.k();
        s2.m();
        s3.k();
        s3.m();
    }

}
