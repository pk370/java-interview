package genericsconcept.generics;

import java.util.ArrayList;
import java.util.List;

public class oracDemo {
    public static void main(String[] args) {
        List k = new ArrayList();
        k.add("dsjf");
        k.add(98);
        String m=(String)k.get(0);
        int j=(int)k.get(1);
    }
}
