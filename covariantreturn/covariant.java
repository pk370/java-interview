package covariantreturn;

public class covariant {
    public static void main(String[] args) {
        A a=new A();
        B b=new B();
        a.showAnim();
        b.showAnim();
    }
}
class A{
    Animal showAnim(){
        Animal k=new Animal();
        System.out.println("I am from parent class");
        return k;
    }
}
class B extends A{
    Cat showAnim(){
        System.out.println("I am from child class");
        Cat m=new Cat();
        return m;
    }
}
