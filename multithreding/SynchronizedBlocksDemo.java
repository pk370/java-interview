package multithreding;

public class SynchronizedBlocksDemo {
    void print(String s){
        synchronized(this){
            for (int i = 0; i < 10; i++) {
                System.out.println("need current object lock"+s    +"  "+i);
            }
        }
        synchronized (dog.class){
            for (int i = 0; i < 10; i++) {
                System.out.println("need dog  object lock"+s    +"  "+i);
            }
        }
    }
}
class MyThread2 extends Thread{
    String s;
    SynchronizedBlocksDemo m;
    dog d;
    MyThread2(String s,SynchronizedBlocksDemo m,dog d){
        this.s=s;
        this.m=m;
        this.d=d;
    }
    public void run(){
        m.print(s);
    }
}
class MyThread3 extends Thread{
    String s;
    SynchronizedBlocksDemo m;
    MyThread3(String s,SynchronizedBlocksDemo m){
        this.s=s;
        this.m=m;
    }
    public void run(){
        m.print(s);
    }
}
class TestMyThread2{
    public static void main(String[] args) {
        SynchronizedBlocksDemo o1=new SynchronizedBlocksDemo();
        SynchronizedBlocksDemo o2=new SynchronizedBlocksDemo();
        MyThread3 t1= new MyThread3("thread t1",o1);
        MyThread3 t2=new MyThread3("thread t2",o1);
        MyThread3 t3=new MyThread3("thread t3",o2);
        MyThread2 t4=new MyThread2("thread t4",o1,new dog());
        t1.start();
        t4.start();
    }
}