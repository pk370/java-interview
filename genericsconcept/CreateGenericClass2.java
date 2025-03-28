package genericsconcept;

public class CreateGenericClass2<T>{
    T obj;
    void add(T o){
        obj=o;
    }
    T getObj(){
        return obj;
    }
}
class testCreateGenericClass2{
    public static void main(String[] args) {
        CreateGenericClass2<Integer> c=new CreateGenericClass2<>();
        c.add(3);
        c.add(9);
        CreateGenericClass2<String> c1=new CreateGenericClass2<>();
        c1.add("object");
        System.out.println(c.getObj());
        System.out.println(c1.getObj());
    }
}