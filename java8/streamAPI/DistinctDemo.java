package java8.streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DistinctDemo {
    public static void main(String[] args) {
        List<Integer> l= Arrays.asList(2,3,4,5,6,7,89,8,8,8,8,8,6,4,3);
        l.stream().distinct().forEach(System.out::println);
        List<Integer> collect = l.stream().distinct().collect(Collectors.toList());
        System.out.println(collect);
    }
}
