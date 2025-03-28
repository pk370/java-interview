package java8.streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortedDemo {
    public static void main(String[] args) {
        List<Integer> l= Arrays.asList(2,3,4,5,6,7,89,8,6,4,3);
        //this is for default sorting
        List<Integer>anotherList=l.stream().sorted().collect(Collectors.toList());
        System.out.println(anotherList);
        //this is for customized sorting
        List<Integer>anotherLIst1=l.stream().sorted((a,b)->b-a).toList();
        System.out.println(anotherLIst1);

        Integer.sum(3, 4);
    }

}
