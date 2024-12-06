import java.util.HashMap;

class Solution {
    public int maxOperations(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int operations = 0;

        for (int num : nums) {
            int complement = k - num;

            // Check if the complement exists in the map and has a count > 0
            if (map.getOrDefault(complement, 0) > 0) {
                operations++;
                  // Add the pair to the result
                  //result.add(Arrays.asList(complement, num));
                // Reduce the frequency of the complement
                map.put(complement, map.get(complement) - 1);
            } else {
                // Add the number to the map
                map.put(num, map.getOrDefault(num, 0) + 1);
            }
        }
        return operations;
    }
}
