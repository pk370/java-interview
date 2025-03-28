package genericsconcept.genericsdemo1;

public class Glass<T>{

    T liquid;
    Glass(T liquid){
        this.liquid=liquid;
    }
    Glass(){

    }
    <T ,U > Cocktail mix(T t){
        return new Cocktail();
    }
}
