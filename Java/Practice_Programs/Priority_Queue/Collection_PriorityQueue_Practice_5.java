package collection_priotityqueue_practice_programs;

import java.util.*;
public class Collection_PriorityQueue_Practice_5 {
    public static void main(String[] args) {

        // Create Priority Queue
        PriorityQueue<String> priorityQueue = new PriorityQueue<String>();

        // use add() method to add values in the Priority Queue
        priorityQueue.add("Red");
        priorityQueue.add("Green");
        priorityQueue.add("Black");
        priorityQueue.add("White");
        System.out.println("Original Priority Queue: "+priorityQueue);

        // Removing all the elements from the Priority Queue
        priorityQueue.clear();

        System.out.println("The New Priority Queue: " + priorityQueue);
    }
}

// code of remove all elements from a priority queue