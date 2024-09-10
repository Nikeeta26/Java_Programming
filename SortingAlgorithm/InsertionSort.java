package nikeeta;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        /*  first arr convert into two part like
           7 3 4 5 3 1 
           7                 8 4 5 3 1
         sorted part             unsorted part

         conpare 1st no. with next no. and put in 1st part and continues
        */

        int arr[] = {5, 3, 4, 5, 6, 7};
        for(int i=1; i<arr.length; i++){
            int current = i;
            int j = i-1;
            while(j>=0 && current<arr[j] ){
                arr[j+1] = arr[j];
                j--;
            }

            arr[j+1] = arr[j];
        }

        for(int i : arr){
        System.out.println(i);
        }
    }
}