package genericsconcept.generics;

import java.util.Arrays;

public class sum <T>{
    Object[] var;
    sum(){
      var=new Object[5];
    }
    public String toString(){
        return "{"+ Arrays.toString(var)+"}";
    }



}
