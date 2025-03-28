package java8.optional;

import java.util.Optional;

public class OptionalDemoIntro {
    public static void main(String[] args) {
        //To create optional object we are having three methods
        //empty,of,ofNullable

        String name=null;
        Optional<Object> emptyOptinal = Optional.empty();
        System.out.println(emptyOptinal);
//
//        Optional<String> name1 = Optional.of(name);
//        System.out.println(name1);

        Optional<String> name2 = Optional.ofNullable(name);
//        System.out.println(name2.get());
//       We do not use get() method directly like above..instead we follow the below process

        if(name2.isPresent()){
            System.out.println(name2.get());
        }
        else{
            System.out.println("there is no element");
        }
        //If we want a default value if there is no element in optinal object ..then we can use orElse method

        String name3 = name2.orElse("hari");
        System.out.println(name3);

        //we have another method which does the same work as orElse which is orElseGet()

        String name4 = name2.orElseGet(() -> "default");
        System.out.println(name4);

        //if we want to raise the exception when there is no value then we can use orElseThrow method
//        String name5 = name2.orElseThrow(() -> new IllegalArgumentException());
//        System.out.println(name5);

        //we have ifPresent method in optional class.
        String u="udabc";
        Optional<String> k=Optional.ofNullable(u);

        k.ifPresent((s)-> System.out.println(s+" is present in the optional class"));
        emptyOptinal.ifPresent((s)-> System.out.println("there is no value"));

        //we have filter method..
       Optional<String> o= k.filter(res ->res.endsWith("c"));
        System.out.println("the value present in o is :"+o);
        o.ifPresent((s)-> System.out.println(s +" is present in optinal"));

        //we have map method is also there

        Optional<String> o1=k.map(s->s.toUpperCase());
        System.out.println(o1);

    }


}
