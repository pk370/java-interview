package java8.methodreference;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;

public class MethodReferenceDemo3 {
    public Integer meth1(String s){
        return s.length();
    }
    public static Integer meth2(String s){
        return s.length();
    }
    public void meth3(String s){
        System.out.println(s.toUpperCase());
    }

    public Date meth4(){
        return new Date();
    }

    public static void main(String[] args) {
        //*************************** method reference for static method***************************************
        //using lambda expressions
        Function<String,Integer> fun1=(s)->MethodReferenceDemo3.meth2(s);
        //using method reference
        //we are calling the static method here
        Function<String,Integer> fun2= MethodReferenceDemo3::meth2;
        //*************************** method reference for concrete method***************************************
        //using lambda expression
        Consumer<String> con1=(s)->new MethodReferenceDemo3().meth3(s);
        //using method reference
        //we are calling the concrete method here
        Consumer<String> con2= new MethodReferenceDemo3()::meth3;
        //*************************** method reference for the method of parameter***************************************
        //using lambda expression
        Consumer<String> con3=(s)->s.toUpperCase();

        //In the above case we are using the method of the passed parameter object. So we can use method reference like below
        Consumer<String> con4= String::toUpperCase;
        //*************************** method reference for constructor***************************************
        List<String> fruites=new ArrayList<>();
        fruites.add("banana");
        fruites.add("apple");
        fruites.add("banana");
        fruites.add("orange");
        //by using lambda expression
        Function<List<String>, Set<String>> fun3=(f)->new HashSet<>(f);

        //by using method reference
        Function<List<String>, Set<String>> fun4= HashSet::new;

        String name=null;
        System.out.println(name.toUpperCase());


    }
}
