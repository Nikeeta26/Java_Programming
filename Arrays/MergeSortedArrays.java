package nikeeta;
import java.util.Arrays;

public class MergeSortedArrays {
    public static void main(String[] args) {
        int[] array1 = {1, 3, 5, 7};
        int[] array2 = {2, 4, 6, 8};

        int[] mergedArray = mergeSortedArrays(array1, array2);
        
        System.out.println("Merged Sorted Array: " + Arrays.toString(mergedArray));
    }

    public static int[] mergeSortedArrays(int[] array1, int[] array2) {
        int length1 = array1.length;
        int length2 = array2.length;
        int[] mergedArray = new int[length1 + length2];

        int i = 0, j = 0, k = 0; // Pointers for array1, array2, and mergedArray

        // Merge the arrays
        while (i < length1 && j < length2) {
            if (array1[i] <= array2[j]) {
                mergedArray[k++] = array1[i++]; // Add from array1
            } else {
                mergedArray[k++] = array2[j++]; // Add from array2
            }
        }

        // Add remaining elements from array1 (if any)
        while (i < length1) {
            mergedArray[k++] = array1[i++];
        }

        // Add remaining elements from array2 (if any)
        while (j < length2) {
            mergedArray[k++] = array2[j++];
        }

        return mergedArray;
    }
}
