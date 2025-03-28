package collectionpackage.comparablecomparatorpack.comparatorpacka;


import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class comparatorDemo implements Comparator<Integer>{
    @Override
    public int compare(Integer o1, Integer o2) {
        return o1-o2;
    }
}
class Test{
    public static void main(String[] args) {
        List<Integer> l= Arrays.asList(1,2,7,5,3,1,7);
        //implementing comparator interface in another class to use sort method
        l.sort(new comparatorDemo());
        System.out.println(l);
        //creating anonymous class of comparator interface
        Comparator<Integer>comparator=new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1-o2;
            }
        };
        l.sort(comparator);
        System.out.println(l);
        //creating anonymous class of comparator interface inside sort method
        l.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1-o2;
            }
        });
        System.out.println(l);
        //using lambda expression
        l.sort((i,j)->i-j);
        System.out.println(l);

    }
}
