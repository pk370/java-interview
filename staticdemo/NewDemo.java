package staticdemo;

public class NewDemo {
    public static void me(){
        System.out.println(" method in parent class");
    }
}
class Bc extends NewDemo{
    public static void me(){
        System.out.println(" method in child class");
    }
    public static void main(String[] args) {
        me();
        NewDemo.me();
        NewDemo obj1=new Bc();
        obj1.me();
    }
}
class cc extends Bc{
    public static void main(String[] args) {
        me();
    }
}
