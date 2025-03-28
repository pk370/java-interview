package staticinstancecontrolflow;
//static control flow
//The identification of static members from top to bottom.
//Execution of static variable assignments and static blocks from top to bottom.
//Execution of main method.
public class StaticControlFlow {
    static int i=10;
   static  {
        m1();
        System.out.println("the first static block in parent class");
    }

    public static void main(String[] args) {
        m1();
        System.out.println("main method in parent class");
    }
    static void m1(){
        System.out.println("m1 method in parent class and the value of j is "+j);
    }
    static int j=20;
}
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//static control flow when extending another class.
//The identification of static members from parent class to child class.
//Execution of static variable assignments and static blocks from parent class to child class.
//Execution of main method in child class.
class staticControlFlowChild extends StaticControlFlow{
    static int i=100;
    static  {
        m1();
        System.out.println("the first static block in child class");
    }

    public static void main(String[] args) {
        m1();
        System.out.println("main method in child class");
    }
    static void m1(){
        System.out.println("m1 method in child class and the value of j is "+j);
    }
    static int j=200;
}
