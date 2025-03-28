package exceptionhandling;
//If we want to throw an exception object explicitly then we can use throw keyword.
//we can assign message to the exception object.
//we can throw checked or unchecked exceptions by using throw keyword. But we use throw keyword mainly for custom exceptions.


public class ThrowKeywordUnchecked8 {
    //unchecked exceptions are the exceptions which are not checked at compile time.
    //If we throw  an unchecked exception by using throw keyword that exception can be propagated.
    //by default the unchecked exceptions are propagated.
    //Propagation means if the current method does not handle the exception than the method which has called this method is the responsible
    //-- to handle the exception.

    public static void main(String[] args) {
        try {
            meth1();
        }
        catch (Exception e){
            System.out.println("I can catch the exception raised by meth2 If meth1 does not handle");
        }
    }
   static void  meth1(){
        try {
            meth2();
        }
        catch (Exception e){
            System.out.println(" I can handle the exception raised by meth2 if It does not handle itself");
        }
    }
    static void meth2() {
         try {
             throw new ArithmeticException("hello");
         }
         catch (Exception e){
             System.out.println(" I can handle the exception by myself");
         }
    }
}
class ThrowKeywordChecked{
    //checked exceptions are the exceptions which are checked at compile time.
    //throw keyword raising checked exception.
    //by default the checked  exceptions are not propagated.
    public static void main(String[] args) {
            meth1();
    }
    static void  meth1(){
            meth2();
    }
    static void meth2(){
        try {
            throw new Exception("hello"); //If we are throwing checked exception by using throw keyword It will give us compilation error.
            //--So that exception should be handled In this method or we can declare by using throws keyword.
        }
        catch (Exception e){}
    }
}


