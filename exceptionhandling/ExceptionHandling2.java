package exceptionhandling;
//exception handling is a powerful mechanism that is used to handle the runtime errors so that the normal flow of the application can be maintained.
public class ExceptionHandling2 {
    public static void main(String[] args) {
        try {
            System.out.println(90 / 0);
        }
        catch (ArithmeticException e){
            System.out.println(e);
        }
    }
}
