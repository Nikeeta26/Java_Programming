import java.util.PriorityQueue;

class Solution {
    public int findKthLargest(int[] nums, int k) {
        // Create a Min-Heap of size k
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        // Iterate through the array
        for (int num : nums) {
            minHeap.add(num); // Add element to the heap
            // If the heap size exceeds k, remove the smallest element
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }

        // The root of the Min-Heap is the k-th largest element
        return minHeap.peek();
    }
}
