/*
 * 
 * Problem statement
You are given an integer ’n’.

Your task is to return a sorted array (in increasing order) containing all the factorial numbers which are less than or equal to ‘n’.

The factorial number is a factorial of a positive integer, like 24 is a factorial number, as it is a factorial of 4.

Note:
In the output, you will see the array returned by you.
Example:
Input: ‘n’ = 7

Output: 1 2 6

Explanation: Factorial numbers less than or equal to ‘7’ are ‘1’, ‘2’, and ‘6’.
 */

import java.util.ArrayList;
import java.util.List;

public class FactorialNumbers {
    public static void main(String[] args) {
        System.out.println(factorialNumbers(7));
    }

    public static List<Long> factorialNumbers(long n) {
        long result = 1, cnt = 2;
        List<Long> ans = new ArrayList<Long>();

        // ans: 1, result: 2, cnt: 3
        // ans: 1, 2 result: 6, cnt: 4
        // ans: 1, 2, 6 result: 24, cnt: 5
        // end
        while(result <= n) {
            ans.add(result);
            result = result * cnt;
            cnt = cnt + 1;
        }
        return ans;
    }
}

// Time complexity: O(n)
