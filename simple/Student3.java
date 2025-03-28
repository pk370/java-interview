package simple;

public class Student3 extends Student{
    static void m(){
        System.out.println("2child class static method");
    }
    void k(){
        System.out.println("2child class normal method");
    }

    public static void main(String[] args) {
        Student2 s1=new Student2();
        Student2 s2=new Student();
        Student2 s3=new Student3();
        Student s4=new Student();
        Student s5=new Student3();
        Student3 s6=new Student3();
        s1.k();
        s1.m();
        s2.k();
        s2.m();
        s3.k();
        s3.m();
        s4.k();
        s4.m();
        s5.k();
        s5.m();
        s6.k();
        s6.m();
    }
}
