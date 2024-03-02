/*
 * Problem statement
You are given an integer ‘n’.

Your task is to return an array containing integers from 1 to ‘n’ (in increasing order) without using loops.

Example:
Input: ‘n’ = 5

Output: 1 2 3 4 5

Explanation: An array containing integers from ‘1’ to ‘n’ is [1, 2, 3, 4, 5].
 * 
 */

public class PrintN {
    public static void main(String[] args) {
        printNos(5);
    }
    static int count = 0;    
    public static void printNos(int x) {
        if(count == x) {
            return;
        }
        System.out.println(count);
        count++;
        printNos(x);
    }
}
