package collectionpackage.SetInterface;

import java.util.LinkedHashSet;
import java.util.LinkedList;

/*
If we do not want the duplicate elements but insertion order should follow.
then we can use LinkedHashSet
******************Constructors***********
LinkedHashSet<Integer>h=new LinkedHashSet<>();
LinkedHashSet<Integer>h=new LinkedHashSet<>(int initialCapacity);
LinkedHashSet<Integer>h=new LinkedHashSet<>(int initialCapacity, float fillingRatio);
LinkedHashSet<Integer>h=new LinkedHashSet<>(Collection c);
 */
public class LinkedHashSetDemo extends HashSetDemo {
    public static void main(String[] args) {
        LinkedHashSet<Integer>h=new LinkedHashSet<>(3,0.45f);
        h.add(3);
        h.add(4);
        h.add(4);
        System.out.println(h);
    }
}
