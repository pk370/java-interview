package multithreding;
//the life cycle of thread.
//there are 5 states of a thread in its life cycle.
//1.New--whenever we create a thread the thread will be in new state.
//2.runnable--when the thread is invokes the start method it will be moved from new to active state.
//there are two states in active state which are runnable and running..
//3.runnable--when a thread is ready to run mode but it is just waiting for a thread scheduler to allocate the process.
//4.running-when a thread gets the cpu it will move from the runnable state to running state..
//5.waiting --when a thread is inactive for a specific period of time (not permanent). then it is in waiting state.
//6.terminate--when a thread completes it's process then it will moves to the terminate state.

public class ThreadStateDemo implements Runnable{
    public static Thread thread1;

    public static void main(String[] args) throws InterruptedException {
        ThreadStateDemo threadStateDemo=new ThreadStateDemo();
        thread1=new Thread(threadStateDemo);
        System.out.println("when the tread1 is created the state of it is--> "+ thread1.getState());
        thread1.start();
        System.out.println("when the thread1 calls start() method the state of it is -->"+thread1.getState());
    }

    @Override
    public void run() {
        ThreadStateDemo1 threadStateDemo1=new ThreadStateDemo1();
        Thread thread2=new Thread(threadStateDemo1);
        System.out.println("the state of thread2 when it is created--> "+thread2.getState());
        thread2.start();
        System.out.println("the state of thread2 when it calls start() method-->"+thread2.getState());
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("the state of thread2 when it calls sleep() method -->"+thread2.getState());
        try {
            thread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("the state of thread2 when it got completed it's task-->"+thread2.getState());
    }
}
class ThreadStateDemo1 implements Runnable{

    @Override
    public void run() {
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("the state of thread1 when it calls join method on thread2-->"+ThreadStateDemo.thread1.getState());

    }
}
//another example for thread states





//
class ThreadStateDemo2 implements Runnable{
    static Thread t1;
    public static void main(String[] args) throws InterruptedException {
        ThreadStateDemo2 threadStateDemo2=new ThreadStateDemo2();
        t1=Thread.currentThread();
        Thread t2=new Thread(threadStateDemo2);
        System.out.println("the state of the t2 thread-->"+t2.getState());
        t2.start();
        t1.sleep(55);
        System.out.println("the state of the t2 thread after calling start method -->"+t2.getState());
        for(int i=0;i<10;i++){
            System.out.println("hello i am main thread");
        }
    }

    @Override
    public void run() {
        try {
            ThreadStateDemo2.t1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        for (int i=0;i<10;i++){
            System.out.println("i am thread 2");
        }
    }
}
