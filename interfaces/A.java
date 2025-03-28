package interfaces;

public interface A {
    public static final int a=90;
    public abstract void  meth1();
    public default void meth2(){
        System.out.println("this is default mehod in parent interface");
    }
    public static void meth3(){
        System.out.println("this is static method in parent interface");
    }
}

interface B{
//    public static final int a=90;
    public abstract void  meth1();
    public default void meth2(){
        System.out.println("this is default mehod in parent interface");
    }
    public static void meth3(){
        System.out.println("this is static method in parent interface");
    }
}
class c{

}
class Ba extends c implements A,B{

    @Override
    public void meth1() {
        System.out.println(" this is implementation of abstract method from interface A");
    }

    @Override
    public void meth2() {
        System.out.println("hello the problem solved");
        A.super.meth2();
    }
    public static void meth3(){
        System.out.println("this is static method in parent interface");
    }

    public static void main(String[] args) {
        Ba obj1=new Ba();
        obj1.meth1();
        obj1.meth2();
        meth3();
        //the static methods from interface are not even available to the child classes

    }

}
