public class Anonymous {
    public static void main(String[] args) {

        // anonymous class


        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Implementation of Anonymous class.");
            }
        }).start();
    }
}
