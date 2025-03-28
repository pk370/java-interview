package collectionpackage.listinterface;

import java.util.*;
import java.util.concurrent.BlockingQueue;
/*
1.the underlying data structure is resizable array or growable array.
2.Duplicates are allowed.
3.insertion order is preserved.
4.Heterogeneous objects are allowed.(Except treeSet and TreeMap, Everywhere heterogeneous elements are allowed.
5.Null insertion is allowed.
6.It implements random access.
7.every method is non synchronized.
8.Not thread Safe.
9.performance is good.

***********Constructors ********
1.ArrayList a=new ArrayList();
2.ArrayList a=new ArrayList(int initialCapacity); By default initial capacity is 10.
    It will grow based on this formulae (new Capacity=(current capacity*(3/2)+1)) ..
3.ArrayList a=new ArrayList(Collection c).
 */

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> b=new ArrayList<>();
        ArrayList<Integer>c=new ArrayList<>(b);
        List<Integer> l=Collections.synchronizedList(b);//If we want the arrayList as synchronized, We can use this method to get that list.
        b.add(null);
        b.add(null);
    }
}
