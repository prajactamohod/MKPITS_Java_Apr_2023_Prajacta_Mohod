public class Main  {
    public static void main(String args[]) {
        Thread t1=new Thread(new MyThread3());
        Thread t2=new Thread(new MyThread2());
        Thread t3=new Thread(new MyThread1());
        t2.start();
        try {
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        t3.start();
    }}