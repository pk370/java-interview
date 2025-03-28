package genericsconcept;

import staticdemo.A;

public class Animal {
    String name;
    Animal(){

    }
    Animal(String name){
        this.name=name;
    }
    void run(){
        System.out.println(name+" is running");
    }
}
class Tiger extends Animal {

    String name;
    Tiger(){

    }
    Tiger(String name){
        this.name=name;
    }
    void run(){
        System.out.println(name+" tiger is running");
    }
}
class Cat extends Tiger{
    String name;
    Cat(String name){
        this.name=name;
    }
    void run(){
        System.out.println(name+ " cat is running");
    }
}