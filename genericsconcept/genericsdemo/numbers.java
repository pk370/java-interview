package genericsconcept.genericsdemo;

public class numbers <T>{
    T t;
    numbers (T t){
        this.t=t;
    }
    void print(){
        System.out.println(t);
    }
}
