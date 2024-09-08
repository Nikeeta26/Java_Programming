package nikeeta;

public class selectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[] = {7,8,3,1,2};
for(int i=0; i<arr.length-1; i++) {
	int s = i;
	for(int j=i+1; j<arr.length;j++) {
		if(arr[s]>arr[j]) {
			s = j;
		}
	}
	int temp = arr[s];
	arr[s] = arr[i];
	arr[i] = temp;
}

for(int i : arr) {
System.out.println(i);
}
	}

}
