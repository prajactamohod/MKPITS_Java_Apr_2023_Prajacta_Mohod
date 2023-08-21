 public class ThreadA {
    public static void main(String[] args) {
        ThreadB b = new ThreadB();       //b is object
        b.start();
        synchronized (b) {
            try {
                System.out.println("Waiting for b to complete....");
                b.wait();  //if we will not use wait one thread will only excute
            } catch (InterruptedException e) {
               System.out.println(e);
            }
            System.out.println("Total is: " + b.total);
        }

    }
}
