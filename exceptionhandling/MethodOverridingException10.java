package exceptionhandling;

import java.sql.SQLException;

public class MethodOverridingException10{
    static void method1(){
        System.out.println("hello");
    }
    static void method2() throws Exception{
        System.out.println("hii");
    }
}
class MethodOverridingException10_2 extends MethodOverridingException10{
    static void method1() throws RuntimeException{ //If parent method does not throw an exception then child class method should not throw
                                                   //--an exception or It can throw unchecked exception.
        System.out.println("hi");
    }
    static void method2() throws RuntimeException {//If parent method throw an exception then the child method can throw the same or the
                                                   //--child class of that exception or none.
        System.out.println("I am throwing child class of Exception");
    }
    public static void main(String[] args) {

    }
}
