package collection_priotityqueue_practice_programs;


import java.util.PriorityQueue;
public class Collection_PriorityQueue_Practice_8 {
    public static void main(String[] args) {

        // Create Priority Queue
        PriorityQueue<Integer> priorityQueue_first = new PriorityQueue<Integer>();
        PriorityQueue<Integer> priorityQueue_second = new PriorityQueue<Integer>();

        // Add numbers in the Queue
        priorityQueue_first.add(10);
        priorityQueue_first.add(22);
        priorityQueue_first.add(36);
        priorityQueue_first.add(25);
        priorityQueue_first.add(16);
        priorityQueue_first.add(70);
        priorityQueue_first.add(82);
        priorityQueue_first.add(89);
        priorityQueue_first.add(14);
        System.out.println("Original Priority Queue: "+priorityQueue_first);
        System.out.println("The first element of the Queue: "+priorityQueue_second.peek());
    }
}

// code  to retrieve the first element of the priority queue