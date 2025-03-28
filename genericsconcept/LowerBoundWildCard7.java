package genericsconcept;

import interfaces.A;

import java.util.ArrayList;
import java.util.List;

public class LowerBoundWildCard7 {
    public static void meth1(List<? super Tiger> l){
        for(Object o:l){
            Animal a=(Animal) o;
            a.run();
        }
    }
    public static void main(String[] args) {
         List<Cat>l1=new ArrayList<>();
         l1.add(new Cat("cat1"));
         //meth1(l1);  It will give us error because cat is not a super class. It is a child class of tiger.
        List<Tiger>l2=new ArrayList<>();
        l2.add(new Tiger("tiger1"));
        l2.add(new Tiger("tiger2"));
        meth1(l2);
        List<Animal>l3=new ArrayList<>();
        l3.add(new Animal("animal1"));
        l3.add(new Animal("animal2"));
        meth1(l3);
    }
}
