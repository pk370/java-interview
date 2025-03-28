package genericsconcept.generics;

public class smd <Students>{
    private int a;
    private String b;
    smd(int a,String b){
        this.a=a;
        this.b=b;
    }

}
class smd1{
    public static void main(String[] args) {
        smd<Student>m=new smd(4,"df");
    }
}
