package staticinstancecontrolflow;
//Instance control flow.
//The identification of instance members from top to bottom.
//The Execution of instance variable assignments and Instance blocks from top to bottom.
//The execution of constructor.
public class InstanceControlFlow {
    int i=10;
    InstanceControlFlow(){
        m1();
        System.out.println("this is constructor in parent class");
    }
    {
        m1();
        System.out.println("this is instance block in parent class");
    }
    void m1(){
        System.out.println("this is m1 method in parent class and the value of j is "+j);
    }
    public static void main(String[] args) {
        new InstanceControlFlow();
        System.out.println("this is main method in parent class");
    }
    int j=20;
}
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//Instance control flow when extending another class.
//The identification of instance members from parent to child.
//Execution of instance variable assignments and instance blocks from top to bottom in parent class.
//execution of constructor in parent class.
//Execution of instance variable assignments and instance blocks from top to bottom in child class.
//execution of constructor in child class.
class InstanceControlFlowChild extends InstanceControlFlow{
    int i=10;
    InstanceControlFlowChild(){
        m1();
        System.out.println("this is constructor in child class");
    }
    {
        m1();
        System.out.println("this is instance block in child class");
    }
    void m1(){
        System.out.println("this is m1 method in child class and the value of j is "+j);
    }

    public static void main(String[] args) {
        InstanceControlFlow c=new InstanceControlFlowChild();
        System.out.println("this is main method in child class");
    }
    int j=20;
}