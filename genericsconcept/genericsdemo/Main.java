package genericsconcept.genericsdemo;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        //calling classes which are having specific datatypes
        IntegerCounter in=new IntegerCounter(4);
        in.print();
        DoubleCounter dob=new DoubleCounter(7.0);
        dob.print();
        //calling class which having genericsconcept.generics
        numbers<Integer> o1=new numbers<>(3);
        numbers<Double> o2=new numbers(3.0);
        o1.print();
        o2.print();
        //calling class which is numbersBounded1
        numbersBounded1<Integer> ob1=new numbersBounded1(3);
        numbersBounded1<Double> ob2=new numbersBounded1(7.4);
        ob1.print();
        ob2.print();
        //calling class which is numberBounded2
        numbersBounded2<A> obj1=new numbersBounded2<>();
        A a1=new A(45);
//        obj1.t=a1.i;
        obj1.print();

//
//
//
//
//        //calling method genericsconcept.generics  without returntype
//        print(3);
//        print("method without return type");
//        //calling method genericsconcept.generics with return type
//        System.out.println(print(3,5));
//        System.out.println(print(8,"method with return type"));
//        //calling pintListMehod which is having wild card
//        List<String>l=new ArrayList<>();
//        l.add("pavan");
//        l.add("kumar");
//        printList(l);
//        //calling printList1 which is having wild card and bounded
//        List<Integer>i=new ArrayList<>();
//        i.add(3);
//        List<Double>i1=new ArrayList<>();
//        i1.add(4.5);
//        printList1(i);
//        printList1(i1);








    }
   // method genericsconcept.generics with return type
    private static <T,U> U print(T t, U u) {
        return u;
    }

    //mehtod generic without return type
    private static <T> void print(T t){
        System.out.println(t);
    }
    //method with wild card
    private static void printList(List<?> li){
        System.out.println(li);
    }
    //mehod with wild card and bounded
    private  static void printList1(List<? extends Number> ki){
        System.out.println(ki);
    }
}
