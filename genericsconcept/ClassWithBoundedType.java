package genericsconcept;

public class ClassWithBoundedType<T extends Number> {//we can pass Number objects and it's child objects to this class.
    T obj;
    void add(T o){
        obj=o;
    }
    T getObj(){
        return obj;
    }
}
class TestCl{
    public static void main(String[] args) {
        ClassWithBoundedType<Integer> c=new ClassWithBoundedType<>();
        ClassWithBoundedType<Float> c1=new ClassWithBoundedType<>();
        ClassWithBoundedType<Double>c2=new ClassWithBoundedType<>();
        c.add(55);
        c1.add(4.5f);
        c2.add(9.4);
        System.out.println(c.getObj());
        System.out.println(c1.getObj());
        System.out.println(c2.getObj());
    }

}