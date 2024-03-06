/* 
 * Problem statement
Given an array 'arr' of size 'n'.

Return an array with all the elements placed in reverse order.

Note:
You don’t need to print anything. Just implement the given function.
Example:
Input: n = 6, arr = [5, 7, 8, 1, 6, 3]

Output: [3, 6, 1, 8, 7, 5]

Explanation: After reversing the array, it looks like this [3, 6, 1, 8, 7, 5].
 * 
 */

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] nums = {3, 1, 1, 7, 4, 2, 6, 11};
        int[] reversedArr = reverseArray(8, nums);

        System.out.println(Arrays.toString(reversedArr));
    }

    
    public static int[] reverseArray(int n, int []nums) {
        int[] reverse = new int[n];

        int[] reversedArr = reverse(n, nums, reverse);

        return reversedArr;
    }

    static int cnt = 0;

    public static int[] reverse(int n, int[] nums, int[] reverse) {
        if(cnt == nums.length) {
            return reverse;
        }
        reverse[cnt] = nums[n-1];
        cnt = cnt + 1;
        return reverse(n-1, nums, reverse);
    }
}
