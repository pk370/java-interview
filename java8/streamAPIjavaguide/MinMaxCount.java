package java8.streamAPIjavaguide;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import  java.util.Map.Entry;

public class MinMaxCount {

    public static void main(String[] args) {


        Integer min= Stream.of(1,4,6,8,5,3).min(Integer::compareTo).get();
        System.out.println(min);
        Integer max= Stream.of(1,4,6,8,5,3).max(Integer::compareTo).get();
        System.out.println(max);
        long count= Stream.of(1,4,6,8,5,3).count();
        System.out.println(count);
        List<Integer> numbers = Arrays.asList(5, 2, 8, 1, 6);

        // Find minimum value using Stream API
        Optional<Integer> minValue = numbers.stream()
                .min(Integer::compareTo);

        // Check if a minimum value is present and print it
        if (minValue.isPresent()) {
            System.out.println("Minimum value: " + minValue.get());
        } else {
            System.out.println("List is empty, no minimum value found");
        }


        Map<Integer,Product> map=new HashMap<>();
        map.put(1,new Product(1,"df",23423));
        map.put(2,new Product(1,"df",23423));
        map.put(3,new Product(1,"df",23423));

        for(Entry<Integer,Product> entry:map.entrySet()){
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }

    }
}
