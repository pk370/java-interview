package java8.streamAPI;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;


// To represent a group of elements or a group of objects we use collections
// To process the data from the collection we use stream api
public class Filter {
    public static void main(String[] args) {
        List<Integer> l= Arrays.asList(1,2,3,4,5,6,7,9);
        List<Integer>evenNumbers=new ArrayList<>();
        //printing the even numbers without using streams
        for(int i: l){
            if(i%2==0)
            System.out.println(i);
        }
        System.out.println("=========================================================");
        //printing the even numbers by using streams filter method..
        //using Predicate anonymous class
        Predicate<Integer>predicate=new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return integer%2==0;
            }
        };
        l.stream().filter(predicate).forEach(System.out::println);
        System.out.println("=========================================================");
        //using lambda expression for Predicate interface;
        l.stream().filter(n->n%2==0).forEach(System.out::println);
    }


}
