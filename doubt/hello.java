package doubt;

public class hello implements Cloneable{
   int a=98;
   int k=34;
   hello(){

   }
    public static void main(String[] args) throws CloneNotSupportedException {
     hello h=new hello();
     hello g=(hello)h.clone();
        System.out.println(h.a+" "+h.k);
        System.out.println(g.a+" "+g.k);
    }
}
