package enumpack;

import java.lang.reflect.Method;
//enum is a class that represents a group of constants(like final objects).
//enum is implicitly final but we cannot try to add final keyword to it.
//every enum class extends Enum class directly. That is why it cannot extends any other class, But it can implements interfaces.
//we cannot extends enum class because it is final implicitly.
public enum Week {

      SUNDAY(4,5),MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY;//we can pass the values from the objects to the  constructor.
    //**this objects are by default public static final.
    int i;
    int j;
      Week(){ //this constructor will execute for every object passing no arguments in the enum class.
          System.out.println(" iam no arg constructor constructor");
      }
      Week(int i){//this constructor will execute for every object passing 1 argument in the enum class
          this.i=i;
          System.out.println("this is one argument constructor");
      }
      Week(int i,int j){//this constructor will execute for every object passing two arguments in enum class.
          this.i=i;
          this.j=j;
          System.out.println("this is two argument constructor");
      }
      void m1(){//we can have methods in enum.
          System.out.println("hello i am the method m1 in enum");
      }
      static void m2(){
          System.out.println("hello i the method in m2 enum");
      }
}

class TestEnumDemo{
    public static void main(String[] args) {
        Week o1=Week.MONDAY;//we can not create objects from the outside of the enum class. we can only access objects from the
                            //enum class.
         o1.m2();
         //we can pass enum objects to the switch case.
        int k=o1.ordinal();//it will return the position of the object presented in the enum class.
        int k1=Week.SUNDAY.ordinal();
        System.out.println(k);
        System.out.println(k1);
        Class c=o1.getClass();
        Method[] m=c.getClass().getDeclaredMethods();
        Method[] m1=o1.getClass().getMethods();

        for(Method u:m1){
            System.out.println(u.getName());
        }
        switch (o1){
            case MONDAY: System.out.println("this is monday");
                        break;
            case THURSDAY:
                System.out.println("this is thursday");
            case FRIDAY:
                System.out.println("this is friday");
            default:
                System.out.println("this is default case");
        }
        Week[] s1=Week.values();
        for(Week obj:s1){
            System.out.println(obj+" "+obj.i+" "+obj.j);
        }
        System.out.println();Week.values();
        Week n=Week.valueOf("SATURDAY");
        System.out.println(n);
    }
}
