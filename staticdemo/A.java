package staticdemo;

public class A {
    void meth1(){
        System.out.println("normal method in parent class");
    }
   static void meth2(){
        System.out.println("static method in parent class");
    }
}
class B extends A{
    void meth1(){
        System.out.println("normal metod in child class");
    }
    static void meth2(){
        System.out.println(" static method in child class");
    }
    public static void main(String[] args) {
        A obj1=new A();
        A obj2=new B();
        B obj3=new B();
        obj1.meth1();
        obj1.meth2();
        obj2.meth1();
        obj2.meth2();
        obj3.meth1();
        obj3.meth2();

    }
}
