package Stringstringbufferstringbuilder;
//StringBuffer is mutable.
public class StringBufferDemo {
    public static void main(String[] args) {
        StringBuffer s=new StringBuffer();
        System.out.println(s.capacity());// by default 16
        StringBuffer s1=new StringBuffer("hello");// now capacity is 21. capacity will become capacity*2+1 when it exeeds its capacity
        System.out.println(s);
        System.out.println(s.length());
        System.out.println(s.capacity());
        StringBuffer a1=new StringBuffer("hello");
        StringBuffer a2=new StringBuffer("hello");
        System.out.println(a1.equals(a2));//equals method is not there in the stringBuffer class.
        a1.append(89).append(true).append(5.33);//it is method chaining .
        System.out.println(a1);
        a1.ensureCapacity(1000);
        System.out.println(a1.capacity());
        a1.trimToSize();
        System.out.println(a1.capacity());

    }
}
