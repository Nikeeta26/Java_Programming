package nikeeta;
//it work on divide-and-conquer stategy

//O(nlogn)

public class MeargeSord {
	public static void conquer(int arr[], int s,int mid, int e) {
		//o(n)
		
		int merges[] = new int[e - s + 1];
		
		int id1 = s; // first arr 
		int id2 = mid+1; // second arr
		
		int x = 0;  // merges arr index
		
		while(id1 <= mid && id2 <= e) {
			if(arr[id1] <= arr[id2]) {
				
				merges[x] = arr[id1]; // or merges[x++] = arr[id1++]
				x++; 
				id1++;
			}
			else {
				 
				merges[x] = arr[id2];
				x++; 
				id2++;
			}
		}
		
		
		while(id1 <= mid) {
			merges[x] = arr[id1]; // or merges[x++] = arr[id1++]
			x++; 
			id1++;
		}
		
		while(id2 <= e) {
			merges[x] = arr[id2]; // or merges[x++] = arr[id1++]
			x++; 
			id2++;
		}
		
		//copy arr
		for(int i=0, j=s; i<merges.length; i++, j++) {
			arr[j] = merges[i];
		}
	}
	
public static void divide(int arr[], int s, int e) {
	//o(logn)	
	
	if(s >= e) {
			return;
		}
	
	int mid =   s+(e-s)/2;    // or (s + e)/2;
	
	divide(arr, s, mid);
	divide(arr,mid+1,e);
	
	conquer(arr, s, mid, e);
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[] = {6,3,9,5,2,8};
int n = arr.length;   

        divide(arr,0,n-1);
        
        for(int i=0; i<n; i++) {
        	System.out.println(arr[i]);
        }

        System.out.println();
	}

}
