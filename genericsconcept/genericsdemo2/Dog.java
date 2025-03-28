package genericsconcept.genericsdemo2;

public class Dog extends Lion{
    String name;
    Dog(String name){
        this.name=name;
    }
    void showAnimal1(){
        System.out.println(this.name);
    }
}
