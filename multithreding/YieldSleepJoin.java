package multithreding;
interface animal{
    void running() throws InterruptedException;
}
class tiger implements animal{

   public  void running() throws InterruptedException {
//        Thread.yield();//this method will pause the execution of current thread to give chance to the other threads of the same
//                       //priority. We can not expect when it will get the chance again.
//        Thread.sleep(78);//This method will make the thread to sleep for a particular time period.
          Thread.sleep(23,43);
        TestYield.t1.join();//the current thread which is t1 will wait till the execution of t2 thread completes.
        TestYield.t1.join(34);
        TestYield.t1.join(32,6);
        for (int i = 0; i < 10; i++) {
            System.out.println("tiger is running");
        }
    }
}
class dog implements animal{
    public void running(){
        for (int i = 0; i < 10; i++) {
            System.out.println("dog is running");
        }
    }
}
public class YieldSleepJoin implements Runnable {
   animal o;
    YieldSleepJoin(animal o){
       this.o=o;
   }
    @Override
    public void run() {
        try {
            o.running();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
class TestYield{
    static Thread t1;
    public static void main(String[] args) {
        YieldSleepJoin y1=new YieldSleepJoin(new dog());
        YieldSleepJoin y2=new YieldSleepJoin(new tiger());
        t1=new Thread(y1);
     Thread t2=new Thread(y2);
        t1.start();

        t2.start();

    }
}
