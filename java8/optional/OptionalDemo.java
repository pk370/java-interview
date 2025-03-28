package java8.optional;

import java.util.Optional;

class Cat{
    String name;
    int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
public class OptionalDemo {
    public static void main(String[] args) {

        Optional<Cat> tommy = getCatByName("tommy");
        if(tommy.isPresent()){
            System.out.println(tommy.get().getAge());
        }
    }
    private static Optional<Cat> getCatByName(String name){
        Cat cat =new Cat(name,2);
        return Optional.ofNullable(cat);
    }
}

