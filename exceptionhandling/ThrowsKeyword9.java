package exceptionhandling;
//throws keyword is used to declare an exception.By declaring the exception that method provides the information about the exception
// --to the caller method. so that the caller method can handle that exception.
//By using throws keyword the exceptions can be propagated
//We use checked exceptions only with throws keyword;
public class ThrowsKeyword9 {
    public static void main(String[] args) throws   Exception{
        try {
            meth1();
        }
        catch (Exception e){};
    }

    static void meth1() throws Exception{
        meth2();
    }

    static void meth2() throws Exception {
        throw new Exception();
    }
}
