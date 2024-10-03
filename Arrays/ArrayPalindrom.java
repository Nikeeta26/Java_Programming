public class palindromArray {

	public static void name(String s) {

        boolean b = true;
       
        int arr[] = {5,6,7,6,5};
        for(int i=0; i<arr.length/2; i++) {
            if(arr[i] != arr[arr.length-i-1]) {
                b = false;
                break;
            }
        }
        if(b) {
            System.out.println("yes");
        }
        else {
            System.out.println("not");
        }
        
     }
 
 }
 