package multithreding;

class Mobile{
    int charging=40;
    public synchronized  void meth1(){
        for(int i=0;i<4;i++) {
            System.out.println("this meth1 is executijng");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        try {
            wait();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("meth1 completed");
    }
    public synchronized void useMobile(int timeToBeUsed) throws InterruptedException {
       for(int i=1;i<=timeToBeUsed;i++){
           Thread.sleep(1000);
           if(charging==0){
               try {
                   System.out.println("calling wait method");
                   wait();
                   System.out.println("invoked by notify method");
               } catch (InterruptedException e) {
                   throw new RuntimeException(e);
               }
           }
           System.out.println("used mobile for "+i+ " hours");
           charging=charging-10;
       }
        System.out.println("the task is completed");
    }
    public synchronized void rechargeMobile(){
        charging=100;
        for(int i=0;i<4;i++) {

            System.out.println("now the charging is 100%");
            System.out.println("notifying the first thread");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        notifyAll();
    }
}

public class WaitDemo extends Thread {
    public static void main(String[] args)
    {
        Mobile mobile=new Mobile();
        Mobile mobile1=new Mobile();
        Thread thread1=new Thread(){
            @Override
            public void run() {
                try {
                    mobile.useMobile(5);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };
        Thread thread2=new Thread(){
            @Override
            public void run() {
                mobile.rechargeMobile();
            }
        };
        Thread thread3=new Thread(){
            @Override
            public void run() {
                mobile.meth1();
            }
        };
        thread1.start();
        thread2.start();
        thread3.start();
    }
}