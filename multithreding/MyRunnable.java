package multithreding;
//we can create Thread by implementing the runnable interface..
//and then we should create the object of Thread class and pass the child class object
// which implements the runnable interface to the constructor
public class MyRunnable implements Runnable{
    @Override
    public void run() {
        for(int i=0;i<20;i++){
            System.out.println(" iam child class");
        }
    }
}
class TestMyRunnable{
    public static void main(String[] args) {
        MyRunnable myRunnable=new MyRunnable();
        Thread thread=new Thread(myRunnable);
        thread.start();
        for (int i=0;i<20;i++){
            System.out.println(" main method");
        }
        System.out.println("========================================");
    }
}
