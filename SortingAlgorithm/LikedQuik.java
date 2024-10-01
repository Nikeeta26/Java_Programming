package nikeeta;

import java.util.*;

public class LikedQuik {

    // Partition function for QuickSort
    public static int partition(int arr[], int l, int h) {
        int pivot = arr[h];  // Pivot element is the last element
        int j = l - 1;  // Index of smaller element
        
        // Loop to rearrange elements based on pivot
        for (int i = l; i < h; i++) {
            if (arr[i] < pivot) {
                j++;
                // Swap arr[j] and arr[i]
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }

        // Swap the pivot with the element at j+1 position
        j++;
        int temp = arr[j];
        arr[j] = arr[h];
        arr[h] = temp;

        return j;  // Return the index of the pivot
    }

    // Divide function for QuickSort
    public static void divide(int arr[], int l, int h) {
        if (l < h) {
            int pivot = partition(arr, l, h);  // Get the pivot index

            // Recursively sort the left and right parts
            divide(arr, l, pivot - 1);
            divide(arr, pivot + 1, h);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the size of the list
        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt();
 
        LinkedList<Integer> l = new LinkedList<>(); 

        // Input elements into LinkedList
        System.out.println("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            int element = sc.nextInt();
            l.add(element);
        }

        // Convert LinkedList to array for sorting
        int[] arr = new int[l.size()];
        for (int i = 0; i < l.size(); i++) {
            arr[i] = l.get(i);
        }

        // Perform QuickSort on the array
        divide(arr, 0, arr.length - 1);

        // Convert array back to LinkedList after sorting
        l.clear();
        for (int i = 0; i < arr.length; i++) {
            l.add(arr[i]);
        }

        // Output the sorted list
        System.out.println("Sorted LinkedList: " + l);
        
        sc.close();  // Close the scanner
    }
}
