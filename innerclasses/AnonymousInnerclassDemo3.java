package innerclasses;
//Anonymous inner classes are the classes with no name and we can only create one object for instant purpose.
//If we want the methods of a class with extra functionalities like overriding the existing  methods and we want
//--the object of that class for instant purpose(temporary) then instead of having child class, we can have anonymous class
public class AnonymousInnerclassDemo3 {
    public static void main(String[] args) {
        Person p=new Person(){ //Anonymous inner class extending the class.
            void eat(){
                System.out.println("eat fruits");
            }
            //extra methods are not allowed, onl person class methods are allowed.
        };
        p.eat();
        Eatable eatable=new Eatable() {// anonymous inner class implements interface.
            @Override
            public void eat() {
                System.out.println("eat fruits");
            }
        };
        eatable.eat();
        Eatable eatable1=()-> System.out.println("eat lot of fruits");
        eatable1.eat();
    }
}
class Person{
    void eat()
    {
        System.out.println("eat idly");
    }
}
interface Eatable{
    void eat();
}