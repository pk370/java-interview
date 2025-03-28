package java8.functionalinterfaces;

import java.util.function.Predicate;

public class predicateDemo {
    //If we want any functional interface to take one argument of any type and does some conditonal check and then return boolean expression
    //Then we should go for predicate interface.
    //the interface looks like this
    //  interface Predicate<T>{
    //     boolean test(T t);
    //  }
        Predicate<Integer>predicate=new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return (int)integer%2==0;
            }
        };
        //or
        Predicate<Integer>predicate1=(a)->a%2==0;


}
class TestPredicateDemo{
    public static void main(String[] args) {
        predicateDemo predicateDemo=new predicateDemo();
        System.out.println(predicateDemo.predicate1.test(6));
    }
}
