package genericsconcept.genericsdemo;

public class numbersBounded1 <T extends Number>{
    T t;
    numbersBounded1(T t){
        this.t=t;
    }
    void print(){
        System.out.println(t);
    }
}

