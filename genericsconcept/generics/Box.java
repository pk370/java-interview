package genericsconcept.generics;

public class Box<T> {
    private T t;
    Box() {

    }
    public T getObject() {
        return t;
    }

    public void setObject(T t) {
        this.t = t;
    }
}
class test{
    public static void main(String[] args) {
        Box<String> a=new Box<String>();
        a.setObject("hello");
    }
}
