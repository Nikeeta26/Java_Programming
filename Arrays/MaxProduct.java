import java.util.Arrays;

public class MaxProduct {

    // Function to find the maximum product of two integers in an array
    public static int maxProduct(int[] arr) {
        int n = arr.length;
        
        // Sort the array
        Arrays.sort(arr);
        
        // Maximum product is either from the two largest numbers or the two smallest (negative) numbers
        int maxProduct1 = arr[n-1] * arr[n-2];  // Product of two largest numbers
        int maxProduct2 = arr[0] * arr[1];      // Product of two smallest (most negative) numbers
        
        // Return the maximum of the two
        return Math.max(maxProduct1, maxProduct2);
    }

    public static void main(String[] args) {
        int[] arr = {-10, -20, 1, 3, 2, 4};
        
        int result = maxProduct(arr);
        System.out.println("Maximum product of two integers: " + result);
    }
}
