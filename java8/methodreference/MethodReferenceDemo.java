package java8.methodreference;


import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class MethodReferenceDemo {
    public static void main(String[] args) {
        List<Integer>arr1=Arrays.asList(2,3,4,45,5);
        //Anonymous implementation of consumer functional interface
        Consumer<Integer>con=new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.print(integer +" ");
            }
        };
        //printing list values using forEach method and Consumer anonymous class
        arr1.forEach(con);
        System.out.println();
        //creating anonymous class inside forEach method
        arr1.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.print(integer+" ");
            }
        });
        System.out.println();
        //creating lambda expression inside forEach method
        arr1.forEach((u)-> System.out.print(u+" "));
        System.out.println();
        //printing values by using method reference
        arr1.forEach(System.out::print);
        //printing values by using method reference of custom class
        arr1.forEach(mehodRefer1::print);
        //calling sum method by using method reference
        arr1.forEach(mehodRefer1::sum);
        System.out.println(mehodRefer1.ans);
    }
}
class mehodRefer1{
    public static <T> void print(T t){
        System.out.print(t+" ");
    }
     static int ans=0;
    public static void sum(int t){
        ans+=t;
    }
}


