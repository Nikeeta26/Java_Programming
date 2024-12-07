import java.util.*;

class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> s1 = new HashSet<>();
        Set<Integer> s2 = new HashSet<>();

        for (int i : nums1) {
            s1.add(i);
        }

        for (int i : nums2) {
            s2.add(i);
        }

        // Find elements in nums1 that are not in nums2
        Set<Integer> r1 = new HashSet<>(s1);
        r1.removeAll(s2);

        // Find elements in nums2 that are not in nums1
        Set<Integer> r2 = new HashSet<>(s2);
        r2.removeAll(s1);

        // Convert sets to lists and add to the result
        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>(r1));
        result.add(new ArrayList<>(r2));

        return result;
    }

    public static void main(String[] args) {
        int[] n1 = {1, 2, 3};
        int[] n2 = {2, 4, 6};

        Solution solution = new Solution(); // Create an instance of Solution
        List<List<Integer>> result = solution.findDifference(n1, n2);

        // Print the result
        System.out.println(result);
    }
}
