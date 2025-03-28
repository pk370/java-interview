package exceptionhandling;

import interfaces.A;

//In java using nested try blocks is permitted.
// ** sometimes some part of the try block might throw one exception and entire block might throw another exception. In that case we can use
//--nested try blocks.
public class NestedTry6 {
    public static void main(String[] args) {
       try{
//            System.out.println(7/0);
            try{
                System.out.println(9/0);
            }
            catch (ArithmeticException e){
                System.out.println(e.getMessage());
            }
            try{
                String s=null;
                System.out.println(s.length());
            }
            catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
        catch (Exception e){
            System.out.println( e.getMessage());
        }
    }
}
class NestedTry6_1{
    //If inner try block has no particular exception catch block then outer catch block of outer try block can handle that exception.
    //--If the outer try block also has no catch block for the inner try block then system generated error will be printed.
    public static void main(String[] args) {
        try{
            try{
                System.out.println(9/0);
            }
            catch (NullPointerException e){
                System.out.println(e.getMessage());
            }
            try{
                System.out.println(3/0);
            }
            catch (ArithmeticException e){
                System.out.println(e.getMessage());
            }
        }
        catch (ArithmeticException e){
            //** if the outer catch block handled any inner try block exception. Then the rest of the code will not execute in the outer try
            //--block. In this example the controller will not go back to handle the second inner try block.
            System.out.println(e.getMessage());
            System.out.println("I can handle the exception raised in the inner try block");
        }
    }
}

