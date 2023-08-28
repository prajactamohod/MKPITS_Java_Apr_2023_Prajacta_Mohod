
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Queue;
public class StringQueueClass {
    public static void main(String[]args){
        PriorityQueue<String> priorityQueue= new PriorityQueue();

        priorityQueue.offer("Prajaccta");
        priorityQueue.offer("Yashashree");
        priorityQueue.offer("Maithili");
        priorityQueue.offer("Priyanka");

        System.out.println(priorityQueue);


        System.out.println(priorityQueue.peek());
        System.out.println(priorityQueue.poll());

        System.out.println(priorityQueue.peek());
        System.out.println(priorityQueue.poll());

        System.out.println(priorityQueue);
        System.out.println(priorityQueue.size());
    }
}
