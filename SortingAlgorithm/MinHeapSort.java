package nikeeta;

public class MinHeapSort {

    // Function to heapify a subtree rooted at node i
    void heapify(int arr[], int n, int i) {
        int smallest = i; // Initialize smallest as root
        int left = 2 * i + 1; // Left child
        int right = 2 * i + 2; // Right child

        // If left child is smaller than root
        if (left < n && arr[left] < arr[smallest]) {
            smallest = left;
        }

        // If right child is smaller than the smallest so far
        if (right < n && arr[right] < arr[smallest]) {
            smallest = right;
        }

        // If the smallest is not root
        if (smallest != i) {
            int temp = arr[i];
            arr[i] = arr[smallest];
            arr[smallest] = temp;

            // Recursively heapify the affected subtree
            heapify(arr, n, smallest);
        }
    }

    // Main function to sort an array using min heap sort
    void sort(int arr[]) {
        int n = arr.length;

        // Build Min Heap (rearrange array)
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }

        // Extract elements one by one from the heap
        for (int i = n - 1; i > 0; i--) {
            // Move the current root to the end
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // Call heapify on the reduced heap
            heapify(arr, i, 0);
        }
    }

    // Utility function to print an array
    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        MinHeapSort ob = new MinHeapSort();

        int arr[] = {9, 89, 6, 5, 4, 0, 23, 56, 76};
        System.out.println("Unsorted array:");
        printArray(arr);

        ob.sort(arr);

        System.out.println("Sorted array:");
        printArray(arr);
    }
}
