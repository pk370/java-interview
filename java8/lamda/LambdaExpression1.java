package java8.lamda;


import java.util.Date;
import java.util.Locale;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

class FunctionDemo implements Function<String,Integer>{

    @Override
    public Integer apply(String s) {
        return s.length();
    }
}
class ConsumerDemo implements Consumer<String>{

    @Override
    public void accept(String s) {
        System.out.println(s.toUpperCase());
    }
}
class SupplierDemo implements Supplier<Date>{

    @Override
    public Date get() {
        return new Date();
    }
}
public class LambdaExpression1 {
    public static void main(String[] args) {
        //this is traditional way
        Function<String,Integer> fun1=new FunctionDemo();
        fun1.apply("raju");

        Consumer<String> con1=new ConsumerDemo();
        con1.accept("java");

        Supplier<Date> sup1=new SupplierDemo();
        sup1.get();

        //using lambda expression
        Function<String,Integer> fun2=(s)->s.length();
        fun2.apply("navin");

        Consumer<String> con2=(s)->s.toUpperCase();
        con2.accept("java");

        Supplier<Date> sup2=()->new Date();
        sup2.get();


    }
}
