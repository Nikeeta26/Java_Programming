package nikeeta;

import java.util.Arrays;

public class MerageWiyhoutSpace {
public static void show(int arr[], int arr2[], int n, int m) {
	int i = n-1;
	int j = m-1;
	int k = n+m-1;
	while(i >= 0 && j>=0) {
		if(arr[i]>arr[j]) {
			arr[k--] = arr[i--];
			
		}
		else {
			arr[k--] = arr2[j--];
		}
	}
	while(j>=0) {
	 arr[k--] = arr2[j--];
	 
	}
	

	for(int a : arr) {
		System.out.print(a+" ");
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = {1, 3, 5, 7, 9, 0, 0, 0}; // arr1 with space for arr2
        int[] arr2 = {2, 4, 6};
int n= 5;
int m= 3;
//show(arr1, arr2, n, m);
//or
show(arr1, arr2, arr1.length-3, arr2.length);

//System.out.println("Merged Array: " + Arrays.toString(arr1));

	}

}
