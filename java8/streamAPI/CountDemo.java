package java8.streamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CountDemo {
    public static void main(String[] args) {
        List<Integer>l= Arrays.asList(1,2,43,5,6,7,89);
        long k=l.stream().filter((a)->a%2==0).count();
        System.out.println(k);

    }
}
