package nikeeta;

import java.util.HashSet;

public class UnionOFArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int arr1[] = {1,2,3,4,5,6};
    int arr2[] = {1,2,3,4,5,6,7,8,9,10};
       
    HashSet<Integer> set = new HashSet<>();
    
//    for(int a: arr1 ) {
//    	if(!set.contains(a)) {
//    		set.add(a);
//    	}
//    	
//    }
    //or
    
    for(int a=0; a<=arr1.length-1;a++ ) {
    	
    		set.add(arr1[a]);
    	
    	
    }
    
    for(int a: arr2 ) {
    	if(!set.contains(a)) {
    		set.add(a);
    	}
    	
    }
    System.out.println(set);
	}

}
