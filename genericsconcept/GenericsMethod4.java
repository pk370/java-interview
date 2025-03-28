package genericsconcept;

public class GenericsMethod4{
    public static  <T> void m1(T o){
        System.out.println(o);
    }
    public static <T> void m2(T[] arr){
        for (Object i:arr
             ) {
            System.out.print(i+" ");
        }
    }
    public static void main(String[] args) {
        //calling m1 method by passing any type of objects
        m1(4);
        m1(new String("hello"));
        m1(3.4f);
        m1(3.5);
        m1(new GenericsMethod4());
        //calling m2 method by passing any type of arrays.
        Integer arr[]={2,3,4,5};
        String  arr1[]={"2","gf","fg"};
        m2(arr);
        m2(arr1);


    }
}
