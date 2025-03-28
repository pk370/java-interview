package collectionpackage.cursors;

import java.util.*;

public class CursorDemo {
    public static void main(String[] args) {
        Vector<Integer> l=new Vector<>();
        for(int i=0;i<10;i++){
            l.add(i);
        }
//        Enumeration<Integer> e=l.elements();
//        while(e.hasMoreElements()){
//            Integer m=(Integer) e.nextElement();
//        }
//        System.out.println(l);
//        Iterator<Integer> i=l.iterator();
//        while(i.hasNext()){
//            Integer m=(Integer) i.next();
//            if(m==5){
//                i.remove();
//            }
//            System.out.println("helei");
//        }
//        System.out.println(l);
//        ListIterator<Integer>li=l.listIterator();//It can traverse forward direction.
//        while(li.hasNext()){
//            Integer m=(Integer)li.next();
//            if(m==6){
//                li.add(45);
//            }
//            if(m==2){
//                li.remove();
//            }
//           //l.add(56);//ListIterator can perform both remove and add operations.
//
//        }
//        System.out.println(l);
//        while(li.hasPrevious()){//It can traverse in backward direction also.
//            Integer m=(Integer)li.previous();
//            if(m==3) {
//                li.add(456);
//            }
//        }
//        System.out.println(l);
        System.out.println(l);
        for(int r=0;r<7;r++){
            if(r==3){
                l.add(3,45);
            }
        }
        System.out.println(l);

    }
}
