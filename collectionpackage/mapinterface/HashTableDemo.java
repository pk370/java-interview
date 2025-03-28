package collectionpackage.mapinterface;

import java.util.Hashtable;

/*
1.Underlying data structure for hashTable is HashTable.
2.insertion order is based on hashCode.
3.duplicate keys are not allowed. but values are allowed.
4.null keys and null values are not allowed.

 */
public class HashTableDemo {
    public static void main(String[] args) {
        Hashtable<Integer,Integer>h=new Hashtable<>();
        h.put(45,6);
        h.put(34,null);//Even null values are not allowed.
        System.out.println(h);
    }
}
