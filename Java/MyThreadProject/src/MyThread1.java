public class MyThread1 implements Runnable{

    public void run() {

        for(int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName());

        }
    }}
