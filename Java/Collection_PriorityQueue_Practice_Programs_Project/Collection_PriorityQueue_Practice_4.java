package collection_priotityqueue_practice_programs;


import java.util.PriorityQueue;

public class Collection_PriorityQueue_Practice_4 {
    public static void main(String[] args) {

        // Create Priority Queue
        PriorityQueue<String> priorityQueue = new PriorityQueue<String>();

        // use add() method to add values in the Priority Queue
        priorityQueue.add("Prajacta");
        priorityQueue.add("Payal");
        priorityQueue.add("Riya");
        priorityQueue.add("Shalini");
        System.out.println("Original Priority Queue: "+priorityQueue);

        // Inserts the specified element into this priority queue.
        priorityQueue.offer("Blue");

        System.out.println("The New Priority Queue: " + priorityQueue);
    }
}

// code to insert a given element into a priority queue