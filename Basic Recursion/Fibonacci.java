/* 
 * 
 * Problem statement
Given an integer ‘n’, return first n Fibonacci numbers using a generator function.

Example:
Input: ‘n’ = 5

Output: 0 1 1 2 3

Explanation: First 5 Fibonacci numbers are: 0, 1, 1, 2, and 3.
Note:
You don't need to print anything. Just implement the given function.
 */

import java.util.Arrays;

public class Fibonacci {
    public static void main(String[] args) {
        int n = 5;
        int[] result = fibonacci(n);
        System.out.println(Arrays.toString(result));
    }
    
    
    public static int[] fibonacci(int n) {
        int[] fibonacciSequence = new int[n];
        fibonacciSequence[0] = 0;
        if(n > 1) {
            fibonacciSequence[1] = 1;
        }
        if(n == 1) {
            return fibonacciSequence;
        }
        
        recursion(n, fibonacciSequence);
        return fibonacciSequence;
    }

    static int i = 2;

    public static void recursion(int n, int[] fibonacciSequence) {
        if(i == n) {
            return;
        }

        fibonacciSequence[i] = fibonacciSequence[i - 1] + fibonacciSequence[i - 2];
        i = i + 1;
        recursion(n, fibonacciSequence);
    }
}
