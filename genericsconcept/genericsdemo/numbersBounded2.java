package genericsconcept.genericsdemo;

public class numbersBounded2 <T extends A>{
    T t;
    numbersBounded2(){
        this.t=t;
    }
    void print(){
        System.out.println(t);
    }
}
class A{
    Integer i;
    A(){

    }
    A(Integer i){
        this.i=i;
    }
    void print(){
        System.out.println(i);
    }
}
class B extends A{
    Double i;
    B(Double i){
        this.i=i;
    }
    void print(){
        System.out.println(i);
    }
}
class c extends A{
    Float i;
    c(Float i){
        this.i=i;
    }
    void print(){
        System.out.println(i);
    }
}
