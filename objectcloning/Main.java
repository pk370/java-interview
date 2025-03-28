package objectcloning;

public class Main {
    static int k=0;
    int m=0;
    {
        System.out.println("hello I am empty blocks");
        m=9;
    }
    {
        m=78;
    }
    static {
        System.out.println("hello I am static blocks");
        k=10;
    }
    static{
        k=90;
    }

    public static void main(String[] args){
        System.out.println("Hello i am main method");

        System.out.println(new Main().m);
        System.out.println(k);
    }
}
