import java.util.*;

public class MaxMinNo {
  public static void main(String args []) {
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int arr = new int[n];

      int max = Integer.MIN_VALUE;
      int min = Integer.MAX_VALUE;


for(int i=0; i<n; i++){
   arr[i]=sc.nextInt();
}

    for(int i=0; i<arr.length; i++) {
           if(arr[i] < min) {
               min = arr[i];
           }
           if(arr[i] > max) {
               max = arr[i];
           }
       }
    
      System.out.println("Largest number is : " + max);
      System.out.println("Smallest number is : " + min);

 }
}

