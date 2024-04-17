package leetTasks._122_hasAlternatingBits;

/*
Given a positive integer, check whether it has alternating bits: namely,
if two adjacent bits will always have different values.
Example 1:
Input: n = 5
Output: true
Explanation: The binary representation of 5 is: 101
 */
public class Solution {
    public static void main(String[] args) {
        int n = 7;
        System.out.println(hasAlternatingBits(n));
    }

    public static boolean hasAlternatingBits(int n) {

        char[] binaryCharArray = Integer.toBinaryString(n).toCharArray();

        for (int i = 1; i < binaryCharArray.length; i++) {
            if(binaryCharArray[i] == binaryCharArray[i-1]) return false;
        }
        return true;
    }
}
