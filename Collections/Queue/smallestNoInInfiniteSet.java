import java.util.PriorityQueue;
import java.util.HashSet;

class SmallestInfiniteSet {
    private PriorityQueue<Integer> minHeap;
    private HashSet<Integer> set;
    private int nextSmallest;

    // Constructor to initialize the data structures
    public SmallestInfiniteSet() {
        minHeap = new PriorityQueue<>();
        set = new HashSet<>();
        nextSmallest = 1; // Start with the smallest positive integer
    }
    
    // Method to pop the smallest number
    public int popSmallest() {
        // If the heap is not empty, remove and return the smallest element
        if (!minHeap.isEmpty()) {
            int smallest = minHeap.poll();
            set.remove(smallest); // Remove from the set to keep tracking accurate
            return smallest;
        }
        // Otherwise, return the next smallest number from the sequence
        return nextSmallest++;
    }
    
    // Method to add back a number to the set
    public void addBack(int num) {
        // Add the number only if it's smaller than nextSmallest and not already in the heap
        if (num < nextSmallest && set.add(num)) {
            minHeap.add(num);
        }
    }

    public static void main(String[] args) {
        SmallestInfiniteSet smallestInfiniteSet = new SmallestInfiniteSet();
        smallestInfiniteSet.addBack(2);    // No change since 2 is not popped yet.
        System.out.println(smallestInfiniteSet.popSmallest()); // Output: 1
        System.out.println(smallestInfiniteSet.popSmallest()); // Output: 2
        System.out.println(smallestInfiniteSet.popSmallest()); // Output: 3
        smallestInfiniteSet.addBack(1);    // Add 1 back to the set.
        System.out.println(smallestInfiniteSet.popSmallest()); // Output: 1
        System.out.println(smallestInfiniteSet.popSmallest()); // Output: 4
        System.out.println(smallestInfiniteSet.popSmallest()); // Output: 5
    }
}

Input
["SmallestInfiniteSet", "addBack", "popSmallest", "popSmallest", "popSmallest", "addBack", "popSmallest", "popSmallest", "popSmallest"]
[[], [2], [], [], [], [1], [], [], []]
Output
[null, null, 1, 2, 3, null, 1, 4, 5]