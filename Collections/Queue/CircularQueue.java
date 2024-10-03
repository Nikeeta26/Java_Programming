A Circular Queue in Java is a type of queue where the last
 position is connected back to the first position, 
 making the queue circular. This allows efficient use of space by 
 reusing previously occupied positions when elements are dequeued.

Key Points:
Fixed Size: Operates within a fixed capacity, ensuring no wasted space.

Efficient Use of Space: After the last position is reached,
 the queue wraps around to use the first position if available.

Two Pointers: It uses two pointers:
Front: Tracks the front element.
Rear: Tracks the last element added.

Full and Empty Conditions:
The queue is full when the next position of rear is front.
It is empty when front equals -1.

A circular queue is a linear data structure where the last position is connected to the first position to form a circle. This structure helps utilize the available space efficiently.
It operates strictly under the FIFO (First In First Out) principle.
In a circular queue, you can only enqueue elements at the rear and dequeue elements from the front.

O(1) add
O(1) remove
O(1) peek


import java.util.*;

public class CircularQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 int capacity = 5;
	        Queue<Integer> circularQueue = new ArrayDeque<>(capacity);

	        // Enqueue elements
	        for (int i = 1; i <= capacity; i++) {
	            circularQueue.offer(i);  // also use add
	        }

	        System.out.println("Queue after enqueuing: " + circularQueue);

	        // Dequeue elements
	        circularQueue.poll(); // also remove
	        circularQueue.poll();

	        System.out.println("Queue after dequeuing: " + circularQueue);

	        // Enqueue more elements to simulate circular behavior
	        circularQueue.offer(6);  // also use add
	        circularQueue.offer(7);

	        System.out.println("Queue after wrapping around: " + circularQueue);
	    }
}
