package collection_priotityqueue_practice_programs;

import java.util.PriorityQueue;
public class Collection_PriorityQueue_Practice_7 {

    public static void main(String[] args) {
        // Create a empty Priority Queue

        PriorityQueue<String> priorityQueue_first = new PriorityQueue<String>();
        // use add() method to add values in the Priority Queue

        priorityQueue_first.add("Prajacta");
        priorityQueue_first.add("Pooja");
        priorityQueue_first.add("Prince");
        priorityQueue_first.add("Payal");
        System.out.println("First Priority Queue: "+priorityQueue_first);

        PriorityQueue<String> priorityQueue_second = new PriorityQueue<String>();
        priorityQueue_second.add("Piyush");
        priorityQueue_second.add("Pratik");
        priorityQueue_second.add("Priya");
        priorityQueue_second.add("Prachi");
        System.out.println("Second Priority Queue: "+priorityQueue_second);

        //comparison output in Priority Queue
        for (String element : priorityQueue_first){
            System.out.println(priorityQueue_second.contains(element) ? "Yes" : "No");
        }
    }
}

// code to compare two priority queues