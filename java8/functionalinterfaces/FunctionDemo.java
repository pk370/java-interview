package java8.functionalinterfaces;

import java.util.function.Function;

public class FunctionDemo {
    //If we want any functional interface to take one argument of any type and does some operations and then return any type of value
    //then we should go for Function functional interface.
    //Function interface looks like this.
    //Interface Function<T,R>{
    //  R apply(T t);
    //}
    Function<Integer,Integer>function=new Function<Integer, Integer>() {
        @Override
        public Integer apply(Integer integer) {
            return integer*integer;
        }
    };
    Function<Integer,Integer>function1=(a)->a*a;
}
class TestFunctionDemo{
    public static void main(String[] args) {
        FunctionDemo functionDemo=new FunctionDemo();
        System.out.println(functionDemo.function1.apply(8));
    }
}
