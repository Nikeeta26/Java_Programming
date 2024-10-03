package nikeeta;

import java.util.*;

public class RemoveDublicateFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int arr[] = { 1,3,4,4,4,4,4,5,6};
       Arrays.sort(arr);
       HashSet<Integer> h = new HashSet<>();
       
       for(int i=0; i<arr.length; i++) {
    	   if(!h.contains(arr[i])) {
    		   h.add(arr[i]);
    	   }
       }
       Iterator t = h.iterator();
       while(t.hasNext()) {
    	   System.out.println(t.next());
       }
      
       
	}

}
