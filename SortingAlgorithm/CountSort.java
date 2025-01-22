package nikeeta;

	import java.util.Arrays;

	public class CountSort {
	    public static int[] countSort(int[] inputArray) {
	        int N = inputArray.length;
	        int M = 0;

	        for (int i = 0; i < N; i++) {
	            M = Math.max(M, inputArray[i]);
	        }

	        int[] countArray = new int[M + 1];

		//countArray = [0, 1, 0, 2, 1, 2, 0, 0, 0, 1, 0, 0, 1];

	        for (int i = 0; i < N; i++) {
	            countArray[inputArray[i]]++;
	        }

            //countArray = [0, 1, 1, 3, 4, 6, 6, 6, 6, 7, 7, 7, 8]
			
	        for (int i = 1; i <= M; i++) {
	            countArray[i] += countArray[i - 1];
	        }

	        int[] outputArray = new int[N];

			// outputArray = [1, 3, 3, 4, 5, 5, 9, 12]

	        for (int i = N - 1; i >= 0; i--) {
	            outputArray[countArray[inputArray[i]] - 1] = inputArray[i];
	            countArray[inputArray[i]]--;
	        }

	        return outputArray;
	    }

	    public static void main(String[] args) {
	        int[] inputArray = {4, 3, 12, 1, 5, 5, 3, 9};
	        int[] outputArray = countSort(inputArray);

	        for (int i = 0; i < inputArray.length; i++) {
	            System.out.print(outputArray[i] + " ");
	        }
	    }
	}