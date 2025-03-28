package collectionpackage.listinterface;

import java.util.LinkedList;

/*
***********LinkedList***********
1.the underlying data structure is double linked list.
2.insertion order is preserved.
3.duplicate objects are allowed.
4.Heterogeneous objects are allowed.(Except treeSet and TreeMap, Everywhere heterogeneous elements are allowed.
5.Null insertion is possible.
4.It does not implement random access.
5.LinkedList is the best choice, If our frequent operation is insertion or deletion in the middle.
*********constructors**********
*         LinkedList<Integer> l=new LinkedList<>();//we cannot specify the capacity.
        LinkedList<Integer> l1=new LinkedList<>(l);
 */
public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<Integer> l=new LinkedList<>();//we cannot specify the capacity.
        LinkedList<Integer> l1=new LinkedList<>(l);
        //the LinkedList methods. We usually use the LinkedList to implement stack and queue.That is why the linked list has
        //below methods
        l.addFirst(4);
        l.addLast(2);
        l.getFirst();
        l.getLast();
    }

}
