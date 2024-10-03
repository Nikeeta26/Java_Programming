A Priority Queue in Java is a type of 
queue that orders its elements based on their priority. 
Unlike a regular queue that follows FIFO (First In First Out) order,
a priority queue allows elements with higher priority to be dequeued
before elements with lower priority, regardless of their order in the queue.
The PriorityQueue class is part of the Java Collection Framework.

Key Features of PriorityQueue:
Ordering: The order of elements is determined by their
natural ordering (if they implement Comparable) or by a provided Comparator.
Dynamic Sizing: Like other collection types, a PriorityQueue can grow as needed.
Not Thread-Safe: It is not synchronized; if multiple threads access a 
PriorityQueue concurrently, it must be externally synchronized.

public PriorityQueue{
public static void main(String[] args) {
    // Create a priority queue of integers
    PriorityQueue<Integer> pq = new PriorityQueue<>();

    // Adding elements to the priority queue
    pq.offer(5);
    pq.offer(1);
    pq.offer(3);
    pq.offer(4);
    pq.offer(2);

    // Displaying the priority queue
    System.out.println("Priority Queue: " + pq);

    // Peek at the highest priority element (smallest number)
    System.out.println("Peek: " + pq.peek()); // Should be 1 (highest priority)

    // Removing elements from the priority queue
    System.out.println("Removing elements from the priority queue:");
    while (!pq.isEmpty()) {
        System.out.println(pq.poll()); // Removes and prints the highest priority element
    }
}
}
