package anonymous;

public class AnonymousInner {
    void mymethod(){
        System.out.println("hello ");
    }
}
interface Anon{
    public void me();
}
class Outer_class {

    public static void main(String args[]) {
        AnonymousInner inner = new AnonymousInner() {
            public void mymethod() {
                System.out.println("This is an example of anonymous inner class");
            }
        };
        inner.mymethod();
    }
    void he(){
        System.out.println("hello you are using anonymous class");
        Anon o=new Anon(){
            public void me(){
                System.out.println("anonymous class method was called");
            }
        };
        o.me();
    }
}
class c{
    public static void main(String[] args) {
        Outer_class ob=new Outer_class();
        ob.he();
    }
}
