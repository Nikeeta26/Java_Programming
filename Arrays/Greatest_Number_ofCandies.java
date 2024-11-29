package nikeeta;

import java.util.ArrayList;
import java.util.List;

public class Greatest_Number_ofCandies {
	public static List<Boolean> getValue(int arr[], int key){
		int max = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
		}
		
		List<Boolean> result = new ArrayList<>();
		
//		for(int candies : arr) {
//			result.add(candies+key >= max);
//		}
		for(int i=0; i<arr.length; i++) {
			result.add(arr[i]+key >= max);
		}
		
		return result;
		
	}
	public static void main(String[] args) {
		int candies[] = {2, 3, 4, 5, 3};
		int extract = 2;
		System.out.println(getValue(candies, extract));
	}
}
