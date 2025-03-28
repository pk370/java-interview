package collectionpackage.mapinterface;

import java.util.LinkedHashMap;
/*
********************Constructors***********
LInkedHashMap<Integer>h=new LInkedHashMap<>();
LInkedHashMap<Integer>h=new LInkedHashMap<>(int initialCapacity);
LInkedHashMap<Integer>h=new LInkedHashMap<>(int initialCapacity, float fillingRatio);
LInkedHashMap<Integer>h=new LInkedHashMap<>(Map m);
 */
public class LinkedHashMapDemo extends HashMapDemo {
    public static void main(String[] args) {
        LinkedHashMap<String,String>a=new LinkedHashMap<>();
        a.put("aaa","bb");//it follows insertion order
        a.put("bbb","bb");
        a.put("ccc","Cc");
        System.out.println(a);
    }
}
