package genericsconcept;

import java.util.ArrayList;

//genericsconcept.generics are introduced in 1.5 version. Before genericsconcept.generics concept came, we used to add any type of data type objects into the
//--collections. So with that we were unable to get type safety and also while retrieving the objects we have to type cast the
//--objects.
//After genericsconcept.generics introduced, the compiler warns the programmer to add the mentioned objects into the collection. so we can get type
//-- safety here. Also if we know the type of objects inside the collection we do not need to type cast the objects while retrieving.
//--so it resolved the type casting issue.
public class genericsL1 {
    public static void main(String[] args) {
          ArrayList a=new ArrayList();//creating the arraylist without genericsconcept.generics.
          a.add(2);
          a.add("df");//we can add anything, If it is a arraylist without genericsconcept.generics
          int b=(int)a.get(0);//so we have to perform the type casting explicitly.
          ArrayList<Integer>a1=new ArrayList<Integer>();//creating the arraylist with genericsconcept.generics
          a1.add(34);//we can add only integer type of objects
          int c=a1.get(0);//type casting is not required.
          ArrayList a2=new ArrayList<String>();//***It is valid syntax. Because the genericsconcept.generics are checked only at compile time.
          //--At runtime it will consider the list as the normal arraylist without genericsconcept.generics.
    }
}
