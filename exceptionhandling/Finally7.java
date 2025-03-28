package exceptionhandling;
//java finally block is used to execute important code such as closing the connections or closing the files.
//this block will execute whether the exception raised or not in try block.
//It is always associated with try block or try catch block.
public class Finally7 {
    public static void main(String[] args) {
        try{
            System.out.println(9/0);
        }
        finally {
            System.out.println("I can be executed, whether the exception raised on not");
        }
    }
}
class Finally7_2{
     static void meth1(){
        meth2();
    }
    static void meth2(){
         meth1();
    }

    public static void main(String[] args) {
        try{
            meth1();
            System.exit(0);
        }
        finally {
            System.out.println("If the try block has system.out() method or chance of raising  errors  then finally block will not be executed");
        }
    }
}