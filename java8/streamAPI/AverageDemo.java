package java8.streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class AverageDemo {
    public static void main(String[] args) {
        List<Integer> l= Arrays.asList(2,3,4,5,6,7,89,8,6,4,3);
        int arr[]={2,4,7};
        OptionalDouble a=Arrays.stream(arr).average();
        System.out.println(a);
    }
}
