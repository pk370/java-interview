package exceptionhandling;

public class WaysOfPrintingExceptions4 {
    public static void main(String[] args) {
        try {
            System.out.println(8/0);
        }
        catch (ArithmeticException e){
            e.printStackTrace();//this method was used by default exception handler.
            System.out.println(e);
            System.out.println(e.getMessage());
        }

    }
}
