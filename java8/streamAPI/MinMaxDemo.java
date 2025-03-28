package java8.streamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinMaxDemo {
    public static void main(String[] args) {
        List<Integer> l= Arrays.asList(2,3,4,5,6,7,89,8,6,4,3);
        int minValue=l.stream().min((a,b)->a-b).get();
        int maxValue=l.stream().max((a,b)->a-b).get();
        System.out.println("the min value is "+minValue+" and the maxvalue is "+maxValue);
    }
}
