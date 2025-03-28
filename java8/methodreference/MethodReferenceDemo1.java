package java8.methodreference;

import java.util.function.BinaryOperator;
import java.util.function.Predicate;

public class MethodReferenceDemo1 {
    public static boolean meth1(int a){
        System.out.println(a);
        return true;
    }
    public static int meth2(int a){
        return a*a;
    }
    public String meth3(String a,String b){
        return a+b;
    }
}
class TestMethodReferenceDemo1{
    public static void main(String[] args) {
        Predicate<Integer>predicate=MethodReferenceDemo1::meth1;
        System.out.println(predicate.test(6));
        BinaryOperator<String> binaryOperator=new MethodReferenceDemo1()::meth3;
        System.out.println(binaryOperator.apply("pavan","kumar"));

    }
}
