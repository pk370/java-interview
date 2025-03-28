package nonstaticstatic;

public class A{
    private int a=0;
    class d{
        public static void k(){
            System.out.println("hello i am inner class");
        }
        void  h(){
            System.out.println("hello i am inner static class"+a);
        }
    }
   static class e {
        static void meth(){
            System.out.println(" I am another inner class");
        }
        void npe(){
            System.out.println("dsfo;i");
        }
    }
    void show(){
        d obj=new d();
        d.k();
        e obj1=new e();
        e.meth();
        obj1.npe();
    }

}
class c{
    public static void main(String[] args) {
        A obj1=new A();
        A.d obj2=obj1.new d();
        A.e obj3=new A.e();
        obj2.h();
        A.e.meth();
        obj3.npe();

    }



}
