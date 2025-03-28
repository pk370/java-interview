package genericsconcept;

import java.util.ArrayList;
import java.util.List;

public class UpperBoundedWildCard6 {
    public static void m1(List<? extends Tiger> o){//wild card upperbound
       for(Tiger t:o){
           t.run();
       }
    }

    public static void main(String[] args) {
          List<Tiger>l1=new ArrayList<>();
          l1.add(new Tiger("tiger1"));
          l1.add(new Tiger("tiger2"));
          List<Cat>l2=new ArrayList<>();
          l2.add(new Cat("cat1"));
          l2.add(new Cat("cat2"));
          m1(l1);
          m1(l2);
    }
}
