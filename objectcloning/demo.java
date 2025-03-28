package objectcloning;

public class demo implements Cloneable{
    int a;
    demo(){
        a=9;
    }
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    public static void main(String[] args) throws CloneNotSupportedException {
        ;
        demo ItCanBeAnything=new demo();
        demo o2= (demo) ItCanBeAnything.clone();
        System.out.println(ItCanBeAnything.a+" "+o2.a);

    }

}
