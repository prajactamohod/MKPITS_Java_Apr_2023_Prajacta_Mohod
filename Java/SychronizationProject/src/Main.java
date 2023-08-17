// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Sender obj = new Sender();
        ThreadedSend t1 = new ThreadedSend("Hii", obj);
        ThreadedSend t2 = new ThreadedSend("Bye", obj);
        t1.start();
        t2.start();
    }
}