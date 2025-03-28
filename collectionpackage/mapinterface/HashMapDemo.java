package collectionpackage.mapinterface;

import java.util.*;


/*
Every method presents in map is non synchronized.
so it is not thread safe.
but the performance is good.
here null key and null values are allowed.
***********COnstructors**********
//constructors same as hashSet.
    HashMap<String,Integer>m=new HashMap<>();
    HashMap<String,Integer>m=new HashMap<>(int initialcapacity);//by default it is 16 Like hashSet
    HashMap<String,Integer>m=new HashMap<>(int initialCapacity,float fillingRatio);
    HashMap<String,Integer>m=new HashMap<>(Map m);
 */
public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String,Integer>m=new HashMap<>();
        HashMap<Integer,Integer>m1=new HashMap<>(3,5.0f);
        m.put("kohli",18);
        m.put("rohit",45);
        m.put("dhoni",7);
        m.put("sachin",10);
        System.out.println(m);
        Set s=m.keySet();
        System.out.println(s);
        Collection c=m.values();
        System.out.println(c);
        Set s1=m.entrySet();
        System.out.println(s1);
        Iterator it= s1.iterator();
        while(it.hasNext()){
            Map.Entry<String,Integer> mi=(Map.Entry<String,Integer>)it.next();
            System.out.println(mi.getKey()+"  and  "+mi.getValue());
        }
        for( Map.Entry<String,Integer> e:m.entrySet()){
            System.out.println(e.getKey()+" "+e.getValue());
        }

    }
}
