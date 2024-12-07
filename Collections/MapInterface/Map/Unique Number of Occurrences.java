import java.util.*;

class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        // Step 1: Count occurrences using HashMap
        HashMap<Integer, Integer> h = new HashMap<>();
        for (int n : arr) {
            h.put(n, h.getOrDefault(n, 0) + 1);
        }

                     //or
        // for(int n : arr){
        //     if(h.containsKey(n)){
        //         h.put(n,h.get(n)+1);
        //     }
        //     else{
        //         h.put(n,1);
        //     }
        // }
 
  
        // Step 2: Store frequencies in a HashSet
        HashSet<Integer> s = new HashSet<>();
        for (int freq : h.values()) {
            s.add(freq);
        }

        // Step 3: Check if all frequencies are unique
        return s.size() == h.size();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        
        // Example Input
        int[] arr = {1, 2, 2, 1, 1, 3};

        // Output the result
        System.out.println(solution.uniqueOccurrences(arr)); // Expected Output: true
    }
}
