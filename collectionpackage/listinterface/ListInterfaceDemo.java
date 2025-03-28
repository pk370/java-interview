package collectionpackage.listinterface;

import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;
import java.util.function.Predicate;

public class ListInterfaceDemo {
    public static void main(String[] args) {
        List<Integer> l=new ArrayList<>();
        l.add(3);
        l.add(4);
        l.add(5);l.add(6);l.add(345);l.add(34);l.add(5346);l.add(433);
        /*ALl these are Collection interface methods.
//        l.add(4);
//        l.addAll(l);//can pass collection of elements.
//        l.remove(4);
//        l.removeAll(l);
//        l.clear();
//        l.retainAll(l);
//        l.contains(9);
//        l.containsAll(l);
//        l.isEmpty();
//        l.size();
        l.toArray();
        l.iterator();
        l.sort((o1,o2)-> 0);
       the below methods are list interface methods.
       add(int index,element)
       remove(int index)
       set(int index,element)
       get(int index)

         */
        System.out.println(l);


    }
}
