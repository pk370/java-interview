package genericsconcept;

import java.nio.channels.ScatteringByteChannel;
import java.util.concurrent.Callable;

class Monkey{
    String name="monkey";
}
class Dog{
    String name="dog";
}
public class CreateAnimal3<T>{
    T animal;
    void addAnimal(T o){
        animal=o;
    }
    T getAnimal(){
        return animal;
    }
}
class Test{
    public static void main(String[] args) {
       CreateAnimal3 c1=new CreateAnimal3();//without genericsconcept.generics
        c1.addAnimal(new Monkey());
        c1.addAnimal(new Dog());
        Dog dog=(Dog) c1.getAnimal();
        CreateAnimal3<Monkey> c2=new CreateAnimal3<>();
        c2.addAnimal(new Monkey());
     //   c2.addAnimal(new Dog());we get compile time error because we mentioned the type of object we want.
        Monkey monkey=(Monkey) c2.getAnimal();
    }
}