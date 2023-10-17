package collection_priotityqueue_practice_programs;


import java.util.*;

public class Collection_PriorityQueue_Practice_9 {
    public static void main(String[] args) {

        // Create Priority Queue
        PriorityQueue<String> priorityQueue = new PriorityQueue<String>();

        // use add() method to add values in the Priority Queue

        priorityQueue.add("Red");
        priorityQueue.add("Green");
        priorityQueue.add("Black");
        priorityQueue.add("White");
        System.out.println("Original Priority Queue: "+priorityQueue);

        //Convert a linked list to array list
        List<String> array_list = new ArrayList<String>(priorityQueue);
        System.out.println("Array containing all of the elements in the queue: "+array_list);

    }
}

// code  to convert a priority queue to an array containing all its elements