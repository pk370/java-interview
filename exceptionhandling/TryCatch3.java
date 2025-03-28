package exceptionhandling;
//Try block is used to enclose the code that might throw an exception. It must be used within the method.
//**  In try block, If an exception occurs at any point the rest of the code will not execute. So It is recommended that not to put the code that will not throw at exception.\
//** java try block can be followed by either catch block or finally block.
public class TryCatch3 {
    public static void main(String[] args) {
        try {
            System.out.println(90 / 0);
            System.out.println("hello");//this code will not execute. because the exception was thrown in the above line.
        }
        catch (ArithmeticException e){
            //keeping the code in catch block is not mandatory
        }
    }
}
class TryFinally{
    //try block can be followed by finally block
    public static void main(String[] args) {
        try{
            System.out.println("hello");
            System.out.println(9/0);
        }
        finally {
            System.out.println("I can execute whether the exception thrown or not");
        }
    }
}