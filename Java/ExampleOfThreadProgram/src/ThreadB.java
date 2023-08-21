public class ThreadB extends Thread{
    int total;
    @Override
    public void run(){
        synchronized (this){                             //block synchronised
            for(int i=0;i<100;i++){
                total +=i;
            }
            notify();          //its notify
        }
    }

}
