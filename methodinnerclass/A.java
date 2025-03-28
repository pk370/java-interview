package methodinnerclass;

public class A {
   int a=79;
    void outMeth(){
        System.out.println("I am inside the outer class method");
        class B{
            void inMeth(){
                System.out.println("I am inside the inner class methode"+a);
            }
        }
        B obj1=new B();
        obj1.inMeth();
    }
}
class c{
    public static void main(String[] args) {
        A obj1=new A();
        obj1.outMeth();

    }
}
