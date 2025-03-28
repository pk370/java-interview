package java8.streamAPIjavaguide;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Product implements  Comparable<Product>{
            int id;
            String name;
            int price;
            Product(){

            }

            public Product(int id, String name, int price) {
                this.id = id;
                this.name = name;
                this.price = price;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public int getPrice() {
                return price;
            }

            public void setPrice(int price) {
                this.price = price;
            }

            @Override
            public String toString() {
                return "Product{" +
                        "id=" + id +
                        ", name='" + name + '\'' +
                        ", price=" + price +
                        '}';
            }

    @Override
    public int compareTo(Product o) {
        return this.getPrice()-o.getPrice();
    }
}
public class FilterDemo {
            public static void main(String[] args) {

                List<Product> products=new ArrayList<>();
                products.add(new Product(1,"abc1",24000));
                products.add(new Product(2,"abc2",25000));
                products.add(new Product(3,"abc3",26000));
                products.add(new Product(4,"abc4",27000));
                products.add(new Product(5,"abc5",28000));

                //normal way to filter the objects
                List<Product>uList=new ArrayList<>();
                for(Product p:products){
                    if(p.getPrice()>25000){
                        uList.add(p);
                    }
                }
                uList.forEach(System.out::println);

                //filtering the objects by using the stream api

                List<Product> productList=products.stream().filter(p->p.getPrice()>25000).collect(Collectors.toList());
                productList.forEach(System.out::println);
            }

}
