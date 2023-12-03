package collection_priotityqueue_practice_programs;

import java.util.PriorityQueue;
public class Collection_PriorityQueue_Practice_3 {
    public static void main(String[] args) {

        PriorityQueue<String> queue_first = new PriorityQueue<String>();
        queue_first.add("Prajacta");
        queue_first.add("David");
        queue_first.add("Shalini");
        System.out.println("Priority Queue1: "+queue_first);

        PriorityQueue<String> queue_second = new PriorityQueue<String>();
        queue_second.add("Pink");
        queue_second.add("White");
        queue_second.add("Black");
        System.out.println("Priority Queue2: "+queue_second);

        // adding queue_second to queue_first
        queue_second.addAll(queue_second);
        System.out.println("New Priority Queue1: "+queue_first);
    }
}

// code to add all the elements of a priority queue to another priority queue