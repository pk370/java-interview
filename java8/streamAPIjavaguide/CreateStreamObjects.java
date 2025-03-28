package java8.streamAPIjavaguide;

import java.util.*;
import java.util.stream.Stream;

public class CreateStreamObjects {
    public static void main(String[] args) {
        //to create a stream
        Stream<String> stream=Stream.of("a","b","c");
        stream.forEach(System.out::println);

        //to create stream from source
        Collection<String> coll= Arrays.asList("java","python","c","c++","c");
        Stream<String> stream1=coll.stream();
        stream1.forEach(System.out::println);

        //to create stream from list
        List<String> coll1= Arrays.asList("java","python","c","c++","c");
        Stream<String> stream2=coll1.stream();
        stream2.forEach(System.out::println);

        //to create stream from set
        Set<String> coll2=new HashSet<>(coll1);
        Stream<String> stream3=coll2.stream();
        stream3.forEach(System.out::println);

        //to create stream from array
        String arr[]={"java","python","c","c++","c"};
        Stream<String> stream4=Arrays.stream(arr);
        stream4.forEach(System.out::println);
    }
}
