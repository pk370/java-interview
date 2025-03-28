package java8.functionalinterfaces;

import java.util.function.Consumer;

public class ConsumerDemo {
    //If we want any functional interface to take one argument of any type and does some operations and return nothing
    //then we should go for Consumer interface
    //Interface Consumer<T>{
    //void accept(T t);
    //}
    Consumer<Integer>consumer=new Consumer<Integer>() {
        @Override
        public void accept(Integer integer) {
            System.out.println(integer+integer);
        }
    };
        Consumer<Integer>consumer1=(b)->System.out.println(b);
}
class TestConsumerDemo{
    public static void main(String[] args) {
        ConsumerDemo consumerDemo=new ConsumerDemo();
        consumerDemo.consumer1.accept(57689);
    }
}
