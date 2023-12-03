package collection_priotityqueue_practice_programs;

import java.util.PriorityQueue;
public class Collection_PriorityQueue_Practice_2 {
    public static void main(String[] args) {
        PriorityQueue<String> priorityQueue = new PriorityQueue<String>();

        priorityQueue.add("Prajacta");
        priorityQueue.add("Prince");
        priorityQueue.add("Payal");
        priorityQueue.add("Priya");
        priorityQueue.add("Pooja");

        System.out.println("Elements of the Priority Queue: ");

        // iterate the Priority Queue
        for (String element :priorityQueue) {
            System.out.println(element);
        }
    }
}

// code of to iterate through all elements in the priority queue