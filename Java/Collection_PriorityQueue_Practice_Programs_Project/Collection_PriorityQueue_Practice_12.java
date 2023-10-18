package collection_priotityqueue_practice_programs;

import java.util.*;
public class Collection_PriorityQueue_Practice_12 {
    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue_first = new PriorityQueue<>(10, Collections.reverseOrder());

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
        System.out.println("\nOriginal Priority Queue: "+priorityQueue_first);

        System.out.print("\nMaximum Priority Queue: ");
        Integer val = null;
        while( (val = priorityQueue_first.poll()) != null) {
            System.out.print(val+"  ");
        }
        System.out.print("\n");
    }
}

// code of change priorityQueue to maximum priority queue