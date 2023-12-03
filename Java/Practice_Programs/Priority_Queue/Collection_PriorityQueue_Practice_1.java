package collection_priotityqueue_practice_programs;

import java.util.PriorityQueue;
public class Collection_PriorityQueue_Practice_1 {
    public static void main(String[] args) {
        PriorityQueue<String> queue=new PriorityQueue<String>();

        queue.add("Prajacta");
        queue.add("Payal");
        queue.add("Prince");
        queue.add("Prajwal");
        queue.add("Priti");

        System.out.println("Elements of the Priority Queue: ");
        System.out.println(queue);
    }
}

// code of create a priority queue, add some colors (strings) and print out the elements of the priority queue