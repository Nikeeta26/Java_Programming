package nikeeta;
import java.util.*;
public class Dublicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> h = new HashSet<>();
		
           int[] arr = {4,5,6,3,4,5,6,3,1,2};
           for(int i=0; i<arr.length; i++) {
        	   if(!h.contains(arr[i])) {
        		   h.add(arr[i]);
        		  // System.out.println(arr[i]);
        	   }
        	   else {
        		   System.out.println(arr[i]);
        	   }
           }
           System.out.println(h);
	}

}
