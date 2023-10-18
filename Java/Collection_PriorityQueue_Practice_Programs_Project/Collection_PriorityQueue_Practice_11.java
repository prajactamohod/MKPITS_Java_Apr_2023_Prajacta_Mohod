package collection_priotityqueue_practice_programs;

import java.util.*;
public class Collection_PriorityQueue_Practice_11 {
    public static void main(String[] args) {

        // Create Priority Queue
        PriorityQueue<String> priorityQueue = new PriorityQueue<String>();
        // use add() method to add values in the Priority Queue
        priorityQueue .add("Reena_Bajaj");
        priorityQueue.add("Shital_Dhaiya");
        priorityQueue.add("Prachi_Adau");
        priorityQueue.add("Dimple_Dara");
        System.out.println("Original Priority Queue: "+priorityQueue);

        //Convert Priority Queue to a string representation
        String str1;
        str1 = priorityQueue.toString();
        System.out.println("String representation of the Priority Queue: "+str1);
    }
}

// code of convert a Priority Queue element to string representations