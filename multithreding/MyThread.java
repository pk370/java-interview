package multithreding;
//we can create thread by extending Thread class ..
//And we should override the run method present in the Thread class.
//Then we should create the object of the child class and call the start method.
//the start method will create the thread and call the run method which is implemented by the child class.
public class MyThread extends Thread  {
    public void run(){
        for(int i=0;i<20;i++){
            System.out.println("I am child class");
        }
    }
}
class TestMyThread{
    public static void main(String[] args) {
        MyThread myThread=new MyThread();
        myThread.start();
        for(int i=0;i<20;i++){
            System.out.println("main method");
        }
        System.out.println("==========================================");
    }
}
