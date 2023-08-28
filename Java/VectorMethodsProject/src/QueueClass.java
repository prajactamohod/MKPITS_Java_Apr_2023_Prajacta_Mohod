import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Queue;






public class QueueClass {
    public static void main(String []args){

        PriorityQueue priorityQueue=new PriorityQueue();

        priorityQueue.offer(90);
        priorityQueue.offer(500);
        priorityQueue.offer(600);
        priorityQueue.offer(800);
        priorityQueue.offer(1000);

        System.out.println(priorityQueue);

        System.out.println(priorityQueue.peek());
        System.out.println(priorityQueue.poll());

        System.out.println(priorityQueue.peek());
        System.out.println(priorityQueue.poll());

        System.out.println(priorityQueue);
        System.out.println(priorityQueue.size());
    }
}
