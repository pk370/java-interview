package java8.streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MapDemo {
    //map is used to update or modify each element from the data
    public static void main(String[] args) {
        List<Integer> l= Arrays.asList(1,2,3,4,5,6,7);
        //using anonymous class of function interface
        Function<Integer,Integer>function=new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer integer) {
                return integer+integer;
            }
        };
        List<Integer>m=l.stream().map(function).toList();
        System.out.println(m);
        System.out.println("===================================================");
        //using lambda expression
        List<Integer>l1=l.stream().map(n->n+n).toList();
        System.out.println(l1);

    }
}
