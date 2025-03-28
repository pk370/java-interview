package java8.streamAPI;

import java.util.Arrays;
import java.util.List;

public class LimitDemo {
    public static void main(String[] args) {
        List<Integer> l= Arrays.asList(2,3,4,5,6,7,89,8,6,4,3);
        l.stream().limit(3).forEach(System.out::println);
    }
}
