class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int I = 1;
        int D = 1;
        int m = 1;
        for(int i=1; i<nums.length; i++)
            {
                if(nums[i] > nums[i-1]){ 
                    I++;
                    D = 1;
                }
                else if(nums[i] < nums[i-1]){                
                       D++;
                       I = 1;
                }
                else{
                     I = 1;
                     D = 1;
                }
                 m = Math.max(m,Math.max(I, D));
            }  

            
            System.out.println(m);
            return m;

          }
}