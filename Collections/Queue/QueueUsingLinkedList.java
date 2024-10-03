package nikeeta;

import java.util.LinkedList;
import java.util.Queue;

public class QueueUsingLinkedList {
    public static void main(String[] args) {
        // Creating a queue using LinkedList
        Queue<Integer> queue = new LinkedList<>();

        // Enqueue elements (add to the queue)
        queue.offer(10);
        queue.offer(20);
        queue.offer(30);
        queue.offer(40);

        // Display the queue
        System.out.println("Queue after enqueuing: " + queue);

        // Dequeue elements (remove from the queue)
        int removedElement = queue.poll(); // Removes the head of the queue
        System.out.println("Dequeued element: " + removedElement);

        // Display the queue after dequeuing
        System.out.println("Queue after dequeuing: " + queue);

        // Peek at the front element
        int frontElement = queue.peek(); // Retrieves, but does not remove, the head of the queue
        System.out.println("Front element: " + frontElement);
    }
}

