package java8.streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;

public class ReduceDemo {
    public static void main(String[] args) {
        List<Integer> l= Arrays.asList(2,3,4);
        int k=l.stream().reduce(4,(a,b)->a+b);
        System.out.println(k);
    }
}
