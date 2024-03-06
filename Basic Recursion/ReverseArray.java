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
        int n = 8;
        int[] reversedArr = reverseArray(n, nums);

        System.out.println(Arrays.toString(reversedArr));

        // option 2
        reverse(nums, 0, n-1);
        System.out.println(Arrays.toString(nums));
    }

    // option 1
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

    // alternative way
    public static void reverse(int[] arr, int start, int end) {
        if (start < end) {
            int tmp = arr[end];
            arr[end] = arr[start];
            arr[start] = tmp;
            reverse(arr, start + 1, end - 1);
        }
    }
}
