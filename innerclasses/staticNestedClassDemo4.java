package innerclasses;

import interfaces.A;

public class staticNestedClassDemo4 {
    static class A{
        void me1(){
            System.out.println("hello i am inner static classes method");
        }
        static void me2(){

        }
    }
    public static void main(String[] args) {
        A a=new A();//creating object for the static nested class inside the outer class.
        a.me1();
    }
}
class Test{
    public static void main(String[] args) {
        staticNestedClassDemo4.A obj=new staticNestedClassDemo4.A();//creating object for static nested class outside the outer class.
        obj.me1();
        staticNestedClassDemo4.A.me2();
    }
}
