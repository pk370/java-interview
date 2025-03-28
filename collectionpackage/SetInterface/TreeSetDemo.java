package collectionpackage.SetInterface;

import java.util.TreeSet;
/*
****************Constructors************
* 1.TreeSet t=new TreeSet():
2.TreeSet t=new TreeSet(Comparator c)
3.TreeSet t=new TreeSet(SortedMap m)
4.TreeSet t=new TreeSet(Map m).
 */
public class TreeSetDemo extends SortedSetInterface {
    public static void main(String[] args) {
        TreeSet<Integer>t=new TreeSet<>();
        t.add(1);
        t.add(2);
        t.add(3);
        System.out.println("based on natural sorting order"+t);
        TreeSet<Integer>t1=new TreeSet<>(((o1, o2) -> o2.compareTo(o1)));
        t1.add(1);
        t1.add(2);
        t1.add(3);
        System.out.println(t1);

    }


}
