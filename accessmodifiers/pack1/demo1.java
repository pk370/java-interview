package accessmodifiers.pack1;

public class demo1{
    static int k=89;
    int h;
    demo1(){
        k=45;
    }
    demo1(int h){
        this.h=h;
    }
    public static void main(String args[]) {
        demo1 a=new demo1();
        demo1 b=new demo1(234);
        System.out.println(a.k+" "+a.h);
        System.out.println(b.k+" "+b.h);

    }
}
interface a{

}
