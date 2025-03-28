package genericsconcept;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WildCard5 {
    public static void m1(List<?> l){//using wild card in the methods. Here we can pass any type of elements in the list.
        for(Object o:l){
            System.out.print(o);
        }
    }
    public static void main(String[] args) {
        List<Integer>l1= Arrays.asList(1,2,3,4,5,6);
        List<String>l2=Arrays.asList("df","rt","rh","rhbdf");
        m1(l1);
        m1(l2);
    }
}
