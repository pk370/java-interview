package objectclass;
//clone method is presented in the object class.
//We use clone method, If we want the exact copy of the object. We can use that object to perform some tasks without disturbing the
//--original object.
//There are two ways to achieve the cloning of object.
//1.shallow cloning.
//2.deep cloning.
class Cat{
    int j;
    Cat(int j){
        this.j=j;
    }
}
class Dog implements Cloneable{//we should implement cloneable interface to achieve cloning.
    int i;
    Cat cat;
    Dog(int i,Cat cat){
        this.i=i;
        this.cat=cat;
    }
//    public Object clone() throws CloneNotSupportedException {//this method is for shallow copy. It will simply calls the object
//                                                               //--class cone method and object class clone method is meant for
//                                                               //--shallow copy.
//        return super.clone();
//    }
    public Dog clone() throws CloneNotSupportedException{//this method is for deep copy.
        Cat cat1=new Cat(cat.j);
        Dog dog2=new Dog(i,cat1);
        return dog2;
    }

}
public class ObjectClone{
    public static void main(String[] args) throws CloneNotSupportedException{
        Cat ca=new Cat(78);
        Dog d1=new Dog(34,ca);
        System.out.println(d1.i+" "+d1.cat.j);
        Dog d2=(Dog) d1.clone();
        System.out.println(d2.i+" "+d2.cat.j);
        d2.i=12;
        d2.cat.j=678;
        System.out.println(d1.i+" "+d1.cat.j);//This is shallow copy.
                                              //If we try to change the member of cat in copy object, The original value will be
                                              //--changed. Because in shallow copy the copy of main object will only be created
                                              //--not the object inside the main object. It will just create the deplicate
                                              //--reference and points to the old object of small object.
                                              //So if we try to change the value in copy object the original object also changed.
        Cat cat1=new Cat(67);
        Dog dog=new Dog(68,cat1);
        System.out.println(dog.i+" "+dog.cat.j);
        Dog dog1=dog.clone();
        System.out.println(dog1.i+" "+dog.cat.j);
        dog1.i=69;
        dog1.cat.j=96;
        System.out.println(dog.i+" "+dog.cat.j);//It is deep copy. If we try to change the values in copy object. the original value
                                                //will not change.

    }
}
