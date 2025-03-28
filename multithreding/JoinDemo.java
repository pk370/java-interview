package multithreding;

public class JoinDemo extends  Thread{
    static int value=0;
    static Thread thread1;
    static Thread thread2;
    public static void main(String[] args) {
       JoinDemo joinDemo=new JoinDemo();
       thread1=new Thread(){
            @Override
            public void run() {
                joinDemo.eat();
            }
        };
        thread2=new Thread(){
            @Override
            public void run() {
                joinDemo.walk();
            }
        };
        thread1.start();
        thread2.start();

    }
    public void eat(){
        for(int i=0;i<5;i++){
            try {
                Thread.sleep(1000);
                System.out.println("man eats apple");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        try {
            thread2.join();
            System.out.println("called join method");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(value);
    }
    public  void walk(){
        for(int i=0;i<10;i++){
            try {
                Thread.sleep(1000);
                System.out.println("man walks around the park");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        value=100;
    }
}
