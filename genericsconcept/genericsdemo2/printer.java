package genericsconcept.genericsdemo2;

public class printer <T>{
    T thingToPrint;
    int m;
    String j;
    printer(T thingToPrint){
        this.thingToPrint=thingToPrint;
    }
    printer(int m,String j){
        this.m=m;
        this.j=j;
    }
    void print(){
        System.out.println(thingToPrint);
    }
}
