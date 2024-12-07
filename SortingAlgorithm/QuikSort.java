package nikeeta;


//pivot : centel elements;
   //we can choose random, mediam, 1st, last element
   //we choose last element

//partition : send element to right and left


//Time compleexcity
  //worst : O(n^2);  --> worst case occuse when pivot is always the smallest or largest elements.
  //Avrage : O(n logn)

public class QuikSort {
	public static int partition(int arr[], int l, int h ) {
		// it return pivot index
		int pivot = arr[h];
		
		int i = l-1;// initialy no elements
		
		for(int j=l; j<h; j++) {
			if(arr[j] < pivot) {
				i++; //track small elements
				
				//swap
				int temp = arr[i];     
				arr[i]   = arr[j];    
				arr[j]   = temp;   // add elements
				
			}
		}
		 
		//create index for pivot element
		i++; 
		//swap pivot elements
		int temp = arr[i];
		arr[i]  = pivot; 
		arr[h]  = temp; // add element
		return i;//pivot index
				
	}
	
public static void quick(int arr[], int l, int h) {
	if(l<h) {
		int pivot = partition(arr, l, h);
		
		quick(arr, l, pivot-1);//small elements
		quick(arr, pivot+1, h );//large elements
		
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr [] = {6,3,9,5,2,8};
int n = arr.length;

quick(arr, 0, n-1);

for(int i=0; i<n; i++) {
	System.out.println(arr[i]);
}
	}

}
