package innerclasses.classinsideinterfaces;

public class InterfaceInsideClass {
    static abstract strictfp interface abc{
        int a=900;
        void meth1();
    }
   static class bh implements abc{

        @Override
        public void meth1() {
            System.out.println(" hello");
        }
    }
    public static void main(String[] args) {
       int k=abc.a;
       new bh().meth1();
    }
}
