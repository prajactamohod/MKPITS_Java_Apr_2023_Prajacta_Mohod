package collection_priotityqueue_practice_programs;


import java.util.PriorityQueue;
public class Collection_PriorityQueue_Practice_6 {

    public static void main(String[] args) {
        // create an empty Priority Queue

        PriorityQueue<String> priorityQueue_count = new PriorityQueue<String>();
        // use add() method to add values in the Priority Queue

        priorityQueue_count.add("Cannon");
        priorityQueue_count.add("Newspapers");
        priorityQueue_count.add("Laptops");
        priorityQueue_count.add("BookStores");
        priorityQueue_count.add("FoodCorners");

        System.out.println("Priority Queue: " + priorityQueue_count);
        System.out.println("Size of the Priority Queue: " + priorityQueue_count.size());
    }
}

// code of

// code count the number of elements in a priority queue