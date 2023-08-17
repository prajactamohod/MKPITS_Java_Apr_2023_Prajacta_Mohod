public class MyThread3 extends Thread {
    public void run() {

        int n = 3;
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName());

        }
    }
}