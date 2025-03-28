package collectionpackage.listinterface;

import java.util.Stack;

/*
1.It is the child class of vector.
2.It is a specially designed class for Last in first out order(LIFO).
**************Constructor***********
there is only one constructor.
1.Stack s=new Stack();
 */
public class StackDemo extends VectorDemo{
    public static void main(String[] args) {
        Stack<Integer> s=new Stack<>();
        System.out.println(s.capacity());
        //stack methods.
        s.push(4);
        s.push(23);
        s.pop();
        s.peek();
        System.out.println(s.get(0));
        s.add(345);
        System.out.println(s);
        s.empty();
        s.search(4);//it returns offset(from the top of the stack 1 based index element)

    }
}
