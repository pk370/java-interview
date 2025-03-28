package collectionpackage.queue;

import java.util.PriorityQueue;
import java.util.Queue;

/*

 */
public class queueInterfaceDemo{
    public static void main(String[] args) {
        Queue<Integer>q=new PriorityQueue<>();
        //queue specific methods.
        q.offer(4);
        q.peek();//returns head of the element but it does not remove the element and if the queue is empty
                // then it simply returns null.
        q.element();//return head of the element but it does not remove the element and if the queue is empty
                  // then it returns exception.
        q.poll();//It removes and return the head element of the queue and if the queue is wmpty then it
                 //it returns null
        q.remove();//It removes and return the head of the element and if the queue is empty then it
                   //returns exception.

    }
}
