package collectionpackage.SetInterface;

import java.util.HashSet;

/*
1.The underlying data structure for hashSet is hashtable.
2.duplicates are not allowed.
3.insertion order not preserved.
4.ALl objects will be inserted based on hashcode of the object.
5.one null can be inserted.
6.Heterogeneous objects are allowed.
***********Constructor****************
1.Hashset h=new HashSet() default initial capacity is 16.
  Default fill ratio/ load factor is 0.75.
  after filling the 75 percent of the hashSet, A new hashSet will be created.
 2.HashSet h=new HashSet(int initialCapacity)
 3.HashSet h=new HashSet(int InitialCapacity,int fillingRatio).
 4.HashSet h=new HashSet(Collection c);

 */
public class HashSetDemo {
    int i;
    HashSetDemo(int i){
        this.i=i;
    }
    HashSetDemo(){

    }
    public static void main(String[] args) {
        HashSet<Integer>h=new HashSet<>(30);
        h.add(null);
        h.add(45);
        System.out.println(h);

    }
    //** If we want the hashSet elements to follow the insertion order or our required order
    // then we should override hashCode method.
    public int hashCode(){
        return 0;
    }
    public String toString(){
        return "HashSetDemo"+i;
    }
}
