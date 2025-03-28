package innerclasses;

public class RegularInnerClassCreateObjectDemo1 {//we can call it as member inner class also.
    class inner{
        void m1(){
        }
    }

    public static void main(String[] args) {
        RegularInnerClassCreateObjectDemo1 o=new RegularInnerClassCreateObjectDemo1();
        RegularInnerClassCreateObjectDemo1.inner o2=o.new inner();//if we want to access the content in inner class first we should create outer class
                                               //--object and then inner class object. with that object we can access the inner class
                                               //members.
        o2.m1();

    }
}
////////////////////////////////////////////////////////////////////////////////////////////////
class NamingConflict1 {
    int a;
    static int b=90;
    void m2(){
        System.out.println("hello i am outer class m2 method");;
    }
    void m1(){
        System.out.println("hello i am outer class m1 method");
    }
    class inner{
        int a=89;
        static int b=99;
        void m1(){
            System.out.println("hello i am inner class m1 method");
            int a=12;
            int b=34;
            System.out.println(a);
            System.out.println(b);
            System.out.println(this.a);//or we can access instance variables of the inner class by using inner.this.a like below
            System.out.println(inner.this.a);
            System.out.println(this.b);
            System.out.println(NamingConflict1.this.a);//If there are no local and instance of inner class, we can access the outer
            //--class variables directly.like below
            m2();
            System.out.println(NamingConflict1.this.b);
            NamingConflict1.this.m1();
        }
    }

    public static void main(String[] args) {
        NamingConflict1 namingConflict2=new NamingConflict1();
        NamingConflict1.inner o=new NamingConflict1().new inner();
        o.m1();
    }
}
