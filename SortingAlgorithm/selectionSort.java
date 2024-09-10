package nikeeta;

public class selectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//o(n^2);
int arr[] = {7,8,3,1,2};
for(int i=0; i<arr.length-1; i++) {
	int s = i;
	for(int j=i+1; j<arr.length;j++) {
		if(arr[s]>arr[j]) {//pick smallest elements
			s = j;
		}
	}
	int temp = arr[s];//add smallest element at first
	arr[s] = arr[i];
	arr[i] = temp;
}

for(int i : arr) {
System.out.println(i);
}
	}

}
