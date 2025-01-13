class Solution {
    public int singleNumber(int[] nums) {
        int result = 0;

        // XOR all numbers in the array
        for (int num : nums) {
            result ^= num;
        }

        return result;
    }
}

Initial State:

result
=
0
result=0
Iterations:
Step 1: XOR with 4

result=0⊕4=4

Step 2: XOR with 1

result=4⊕1=5
Binary:( 101⊕010=111 )


Step 3: XOR with 2

result=5⊕2=7
(Binary:101⊕010=111)

Step 4: XOR with 1

result=7⊕1=6
(Binary:111⊕001=110)

Step 5: XOR with 2

(Binary: 110⊕010=100)

Final Result:
The final value of result is 4, which is the number that appears only once.