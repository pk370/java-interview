package multithreding;

public class SynchronizedMethodDemo {
//    void print(String s){//multiple threads can access this method and we might get irregular output;
//        for (int i = 0; i < 10; i++) {
//            System.out.println(s);
//        }
//    }
//    synchronized void print(String s){//multiple threads can not access this method and we will get regular output But If multiple
//                                     //threads have different objects then they can access this method and irregular output will
//                                     //be displayed.
                                       //All this is because of lock system. every object has one lock and If any thread wants
                                       // to access any synchronized method then it needs the lock of the object on which it is
                                       //running.If multiple threads are running on the same object then remaining threads should
                                       // wait till they get the lock of the object.
//        for (int i = 0; i < 10; i++) {
//            System.out.println(s);
//        }
//    }
       static synchronized void print(String s){//In this case If Threads have different objects or same at a time only one
                                                //one thread can access this method.
                                                //All this is because If we put static to the synchronized method then lock of
                                                //the object will not work. Thread has to get the lock of the class.
                                                //every class has only one lock and at a time only one static synchronized method
                                                //can be executed.
             for (int i = 0; i < 10; i++) {
                  System.out.println(s+i);
             }
         }
}
class MyThread1 extends Thread{
    String s;
    SynchronizedMethodDemo m;
    MyThread1(String s,SynchronizedMethodDemo m){
        this.s=s;
        this.m=m;
    }
    public void run(){
      m.print(s);
    }
}
class TestMyThread1{
    public static void main(String[] args) {
        SynchronizedMethodDemo m1=new SynchronizedMethodDemo();
        SynchronizedMethodDemo m2=new SynchronizedMethodDemo();
        MyThread1 t1=new MyThread1("this is m1 object",m1);
        MyThread1 t2=new MyThread1("this is also m1 object",m1);
        MyThread1 t3=new MyThread1("this is m2 object",m2);
        t1.start();
        t3.start();

    }
}