package wrapperclasses;

public class AutoBoxingUnBoxingDemo {
    public static void main(String[] args) {
        Integer i = 34;//compiler consider this as the Integer.valueOf(34). It is called auto boxing.
        int k = i;//compiler consider this as i.intValue(). it is called auto unboxing.
        //** for autoboxing concept. ALl the wrapper integral classes will be having the values from -126 to127.
        //so when we are creating objects. If it is in the range it will not create the object.
        Integer yu=10;
        Integer yu1=10;
        System.out.println(yu==yu1);//true
        Integer yu2=128;
        Integer yu3=128;
        System.out.println(yu2==yu3);//false
        m1(34);//valid autoboxing happens;
    }
    static void m1(Integer i){
        System.out.println("hello");
    }
}
class widening{
    public static void main(String[] args) {
        byte b=23;
        int i=b;//assigning smaller type primitive to larger type. this is called widening. it only works with primitives.
        long l=b;
        float f=l;
        double d=f;
        m1(l);
        m1(i);
        Object o=67;//here first autoboxing happened and then widening happend.
    }
    static void m1(double d){
        System.out.println("double method");
    }
    static void m1(long l){
        System.out.println("long method");
    }
    static void m1(Long l1){
        System.out.println("Long method");
    }
    static void m1(int i){
        System.out.println("int method");
    }
    static void m1(Integer i){
        System.out.println("Integer method");
    }
    static void m1(int ...x){//it will get least priority.
        System.out.println("var args");
    }

}
