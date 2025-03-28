package exceptionhandling;
//java try block can be followed by multiple catch blocks.
//If we do not know which exception the try block has thrown, In that case we can go for multiple catch blocks.
// **At a time one exception occurs and at a time one catch block execute.
// ** the order of the catch blocks should maintain from most specific to most general. For example : ArithmaticException block should come
//--the Exception block.
public class MultiCatchBlock5 {
    public static void main(String[] args) {
        String m=null;
        try{
           System.out.println(9/0);
            System.out.println(m.length());// Even it is an exception it will not execute because a try block can only handle one exception
                                           //--at a time
        }

        catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
        catch (NullPointerException e){
            System.out.println(e.getMessage());
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
