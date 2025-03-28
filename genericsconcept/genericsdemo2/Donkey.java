package genericsconcept.genericsdemo2;

public class Donkey  extends  Lion{
    String name;
    Donkey(String name){
        this.name=name;
    }
    void showAnimal2(){
        System.out.println(this.name);
    }
}
