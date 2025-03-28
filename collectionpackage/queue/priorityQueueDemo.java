package collectionpackage.queue;

import java.util.PriorityQueue;
/*
1.If we want to represent a group of individual objects prior to processing according to some priority then we should go for
  priorityQueue.
2.The priority can be either default natural sorting order or customized sorting order defined by comparator.
3.Insertion order is not preserved and it is based on some priority.
4.duplicate objects are not allowed.
5.If we are depending on natural sorting order compulsory the objects should be homogeneous and comparable otherwise
  we will get runtime exception saying class cast exception.
6.If we are defining our own sorting by comparator then objects need not be homogeneous and comparable.
7.null is not allowed even as the first element also.
**************constructors*************
PriorityQueue<Integer>a=new PriorityQueue<>();//By default 11 is capacity.
PriorityQueue<Integer>a=new PriorityQueue<>(int initialCapacity);
PriorityQueue<Integer>a=new PriorityQueue<>(int initialCapacity,comparator);
PriorityQueue<Integer>a=new PriorityQueue<>(SortedSet s);
PriorityQueue<Integer>a=new PriorityQueue<>(Collection c);
 */
public class priorityQueueDemo {
    public static void main(String[] args) {
        PriorityQueue<Integer>a=new PriorityQueue<>();
        for (int i = 0; i < 9; i++) {
            a.offer(6*i);
        }
        System.out.println(a.poll());
        System.out.println(a.element());
        System.out.println(a.peek());
        System.out.println(a.remove());
    }
}
