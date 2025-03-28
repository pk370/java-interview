package java8.streamAPIjavaguide;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MapDemo {
    public static void main(String[] args) {

        List<String> fruits=new ArrayList<>();
        fruits.add("banana");
        fruits.add("apple");
        fruits.add("grapes");
        fruits.add("orange");
        //using map method
      List<String> fruitsU=  fruits.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(fruitsU);

        List<Product> products=new ArrayList<>();
        products.add(new Product(1,"abc1",24000));
        products.add(new Product(2,"abc2",98000));
        products.add(new Product(3,"abc3",26000));
        products.add(new Product(4,"abc4",27000));
        products.add(new Product(5,"abc5",28000));

        List<Product> productList=products.stream().map(MapDemo::changePrice).collect(Collectors.toList());
        System.out.println(productList);
    }
    public static Product changePrice(Product p){
        p.setPrice(20000);
        return p;
    }
}
