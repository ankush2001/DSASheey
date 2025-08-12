package CrioDsa101;

import java.util.LinkedList;
import java.util.Queue;

public class QueueSimple {

    Queue<Integer> queue = new LinkedList<>();

    public void insert(int value) {
        // Method to insert an element into the queue
        // Implementation will be provided in the Queue class
        // Placeholder implementation
        // You would need to implement the logic for inserting elements into the queue
        System.out.println("Inserted: " + value);
        // Note: The actual implementation of the insert method is not provided here.
        // You would need to implement the logic for inserting elements into the queue.
        queue.offer(value);
    }

    public int getFirst() {
        // Method to get the first element of the queue
        // Implementation will be provided in the Queue class
       if(queue.isEmpty()){
              throw new IllegalStateException("Queue is empty");
       }else {
            return queue.poll();
       }
    }

    /*
                Input format
            There are Q+1 lines of input
            First line contains Q, number of queries.
            Next Q lines will contain either of the following -
            1 X - insert X in the queue.
            2 - remove the first element of the queue and return it.
            Output format
            For each query of the second type print the first element.
            Sample Input 1
            5

            1 3

            1 2

            2

            1 1

            2

            Sample Output 1
            3

            2


     */
    public static void main(String[] args) {
        // Example usage of QueueSimple
        QueueSimple queue = new QueueSimple();
        queue.insert(3);
        queue.insert(2);
        System.out.println(queue.getFirst()); // Output: 3
        queue.insert(1);
        System.out.println(queue.getFirst()); // Output: 2
        // Note: The actual implementation of insert and getFirst methods is not provided here.
        // You would need to implement the logic for inserting and retrieving elements from the queue.

    }
}
