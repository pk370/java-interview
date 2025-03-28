package collectionpackage.mapinterface;

import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapDemo {
    public static void main(String[] args) {
        //all the methods of sortedSet are available here.
        SortedMap<Integer,Integer>s=new TreeMap<>();
        s.put(4,4);
        s.put(5,9);
        s.put(6,9);
        System.out.println( s.firstKey());
        System.out.println(s.lastKey());
       SortedMap m= s.headMap(5);
        SortedMap m1= s.tailMap(5);



    }


}
