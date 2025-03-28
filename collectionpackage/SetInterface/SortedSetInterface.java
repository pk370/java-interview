package collectionpackage.SetInterface;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetInterface {
    public static void main(String[] args) {
         SortedSet<Integer> s= new TreeSet<Integer>();
         s.add(4);
        s.add(5);
        s.add(6);
        s.add(7);
        s.add(8);
        s.add(9);
        s.add(11);
        s.add(12);
//        s.add(null);
        System.out.println(s);
        //below are the methods from SortedSet Interface.
        s.first();
        s.last();
        s.headSet(2);
        s.tailSet(3);
        s.comparator();
        //All the elements we add in treeSet should be comparable and homogeneous.
        //We can also have heterogeneous elements if we use comparator.




    }
}
