package wrapperclasses;

import java.util.concurrent.BlockingDeque;

//wrapper classes are used to convert primitive to objects.
//all wrapper classes are immutable.
public class IntegerClassDemo {
    public static void main(String[] args) {
        Integer y=10;
        Integer z=y;
        y++;
        System.out.println(y==z);//false , because all wrapper classes are immutable.
        //1.creating objects from primitives and strings
        Integer i = Integer.valueOf(34);
        Integer i1 = Integer.valueOf("67");//these two methods are there in most of the wrapper classes but in char we do not have
        //--String parameter method.
        Boolean b = Boolean.valueOf("TrUe");//it will check the content if it is true it will give you true otherwise it will
        //--give us false;
        Boolean b1 = Boolean.valueOf("Sdfsf");
        System.out.println(b1);//false

        //2.creating string from objects
        Integer i12=Integer.valueOf(45);
        String s=i12.toString();//string object created. Works for all the classes.
        //3.creating primitives from objects.
        Integer ui=Integer.valueOf(78);
        int ui1=ui.intValue();
        //4.creating string from primitives.
        int u=34;
        String s1=Integer.toString(u);
        //creating primitives from strings
        String m="89";
        int ty=Integer.parseInt(m);
        float fo=Float.parseFloat(m);
        String io=Integer.toBinaryString(15);
        int oi=Integer.parseInt("10",2);
        System.out.println(io+" "+oi);
    }
}
