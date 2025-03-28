package java8.functionalinterfaces;

import java.util.Date;
import java.util.function.Supplier;

public class SupplierDemo {
    //if we want any functional interface to take no argument but provide some information when we call them
    // then we should go for supplier interface
    //interface supplier{
    // T get();
    //}
    Supplier<Date>supplier=new Supplier<Date>() {
        @Override
        public Date get() {
            return new Date();
        }
    };
    Supplier<Date> supplier1=()->new Date();
}
class TestSupplerDemo{
    public static void main(String[] args) {
        SupplierDemo supplierDemo=new SupplierDemo();
        System.out.println(supplierDemo.supplier1.get());
    }
}
