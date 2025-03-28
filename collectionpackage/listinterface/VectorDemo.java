package collectionpackage.listinterface;

import java.util.Enumeration;
import java.util.Vector;

/*
1.the underlying data structure is resizable array or growable array.
2.Duplicates are allowed.
3.insertion order is preserved.
4.Heterogeneous objects are allowed.(Except treeSet and TreeMap, Everywhere heterogeneous elements are allowed.
5.Null insertion is allowed.
6.It implements random access.
7.every method is synchronized.(It is the only difference if we compare this with arraylist)
8.It is thread Safe.
*****************constructors**************************
1.Vector v=new Vector();//By default capacity is 10.It will increase the capacity With the formulae (currentCapacity*2).
2.Vector v=new Vector(int initialCapacity).
3.Vector v=new Vector(int initialCapacity,int incremental Capacity).
4.Vector v=new Vector(Collection c).

 */
public class VectorDemo {
    public static void main(String[] args) {
        Vector<Integer>v=new Vector<>();
        //vector methods..
        v.addElement(5);
        v.removeElement(1);
        v.removeElementAt(2);
        v.removeAllElements();
        v.firstElement();
        v.lastElement();
        v.elementAt(4);
        v.capacity();
        Enumeration n=v.elements();

    }
}
