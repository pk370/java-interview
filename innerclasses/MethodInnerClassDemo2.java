package innerclasses;
public class MethodInnerClassDemo2{//we can call it as local inner class also;
    void me(){
        class inner{
            void m(){

            }
        }
        inner inner=new inner();//we can only create the object of method inner class inside the method only.
        inner.m();
    }
    public static void main(String[] args) {

    }
}
//////////////////////////////////////////////////////////////////////////////////////
class NamingConflict2 {
    int a=9;
    static int b=90;
    static void m2(){//if this is static method we can access only instance variables of the outer class.
        class inner2{
            void meth2(){
                System.out.println("hello i am the method of method inner class's meth2");
//                System.out.println(a);here we get the compile time error.
                System.out.println(b);
            }
        }
    }
    void m1(){//If this method is non static we can access the members of the outer class.
        int a=8;
        final int b=908;
         abstract class inner1{//we can make this class as abstract or final
            int a=90909090;
             int b=6755;
            void meth1(){
                int a=1;
                int b=2;
                System.out.println("hello i am method inner class's meth1 method");
                System.out.println("this is the value of outer class a"+a);
                System.out.println("this is the value of outer class b "+this.b);
                System.out.println(NamingConflict2.this.a);
            }
        }
        class inner2 extends inner1{
             void meth1(){
                 System.out.println("hello");
             }
        }
        inner1 inner1=new inner2();
        inner1.meth1();
    }

    public static void main(String[] args) {
          NamingConflict2 namingConflict2=new NamingConflict2();
          namingConflict2.m1();
    }
}
