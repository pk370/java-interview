package java8.streamAPIjavaguide;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortingDemo{

    public static void main(String[] args) {

        List<Product> products=new ArrayList<>();
        products.add(new Product(1,"abc1",24000));
        products.add(new Product(2,"abc2",98000));
        products.add(new Product(3,"abc3",26000));
        products.add(new Product(4,"abc4",27000));
        products.add(new Product(5,"abc5",28000));
        List<String> fruits=new ArrayList<>();
        fruits.add("banana");
        fruits.add("apple");
        fruits.add("grapes");
        fruits.add("orange");
        Collections.sort(fruits,Collections.reverseOrder());
        List<String> sortedFruits = fruits.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
        System.out.println(sortedFruits);
        List<String> sortedFruits1= fruits.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        Collections.sort(products);
        System.out.println(products);
        List<Product> sortedFruits2 = products.stream().sorted(((o1, o2) -> o1.getPrice()-o2.getPrice())).collect(Collectors.toList());
        List<Product> sortedFruits3 = products.stream().sorted(Comparator.comparing(Product::getPrice)).collect(Collectors.toList());

    }

}
