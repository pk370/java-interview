package objectclass;

public class Equals3 {
    int i;
    int j;
    Equals3(int i,int j){
        this.i=i;
        this.j=j;
    }

    public static void main(String[] args) {
        Equals3 equals3=new Equals3(3,4);
        Equals3 equals31=new Equals3(6,7);
        Equals3 equals32=new Equals3(3,4);
        Equals3 equals33=equals3;
        System.out.println(equals3.equals(equals31));//false
        System.out.println(equals3.equals(equals32));//false. because the equal method in object class check the references only
                                                     //If we want to check the content we should override the method
                                                     //"==" operator also check the reference only.

        System.out.println(equals3.equals(equals33));//true
    }
}
//if we want to check the objects based on the content
class EqualsTest{
    int ghk=3;
    int ghj=5;
    EqualsTest(int i,int j){
        ghk=i;
        ghj=j;
    }
    public boolean equals(Object obj){
        if(this==obj) return true;
        if(obj instanceof EqualsTest) {
            EqualsTest e = (EqualsTest) obj;
            System.out.println("hello");
            return ghk == e.ghk && ghj == e.ghj;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
//        EqualsTest e1=new EqualsTest(6,7);
//        EqualsTest e2=new EqualsTest(6,7);
//        System.out.println(e1.equals(e2));
        Integer i= 300;
        Integer h=300;
        System.out.println(i==h);
    }

}
