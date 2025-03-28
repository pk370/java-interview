package genericsconcept;

import java.util.ArrayList;

public class ArrayL<T>{
    static int size=1;
   static Object[] obj;
   T[] k;
    ArrayL(){
        obj=new Object[size];
    }
    void add(Object o){
        obj[size-1]=o;
        size++;
        sizeIncrease();
    }
    static void  sizeIncrease(){
         Object[] obj2=new Object[size];
         for(int i=0;i<size-1;i++){
             obj2[i]=obj[i];
         }
         obj=obj2;
    }
    Object get(int i){
        return obj[i];
    }

}
class testArrayL{
    public static void main(String[] args) {
        ArrayL<Integer>a=new ArrayL<Integer>();
        a.add(9);
        a.add(45);
        a.add(34);
        a.add(67);
        a.add(3423);
        ArrayL<String>b=new ArrayL<>();
        b.add("abc1");
        b.add("abc2");
        for(int i=0;i<a.size-1;i++){
            System.out.println(a.get(i));
        }
        for(int i=0;i<b.size-1;i++){
            System.out.println(b.get(i));
        }

    }
}
