/*
 * Problem statement
You are given an integer ‘n’.

Your task is determining the sum of the first ‘n’ natural numbers and returning it.

Example:
Input: ‘n’ = 3

Output: 6

Explanation: The sum of the first 3 natural numbers is 1 + 2 + 3, equal to 6.
 */

public class SumFirstN {
    public static void main(String[] args) {
        System.out.println(sumFirstN(3));
        System.out.println(optimalSolution(3));
    }

    public static long sumFirstN(long n) {
        if(n == 0) return 0;
        return n + sumFirstN(n-1);
    }

    // Time complexity O(1), mathematical solution
    public static long optimalSolution(long n) {
        return (n*(n+1))/2;
    }
}

