/*
 * Problem statement
You are given an integer 'n'.

Return 'true' if 'n' is an Armstrong number, and 'false' otherwise.

Note:
An Armstrong number is a number (with 'k' digits) such that the sum of its digits raised to 'kth' power is equal to the number itself. For example, 371 is an Armstrong number because 3^3 + 7^3 + 1^3 = 371.

Example:
Input: 'n' = 1634

Output: true

Explanation:
1634 is an Armstrong number, as 1^4 + 6^4 + 3^4 + 4^4 = 1634
 */

public class ArmstrongNumber {
    public static void main(String[] args) {
        System.out.println(isArmstrongNumber(371));
        System.out.println(isArmstrongNumber(1634));
    }

    public static boolean isArmstrongNumber(int n){
        int number = n;
        int armstrong = 0;
        int digits = (int)(Math.log10(number) + 1);
        while(n > 0) {
            int lastDigit = n % 10;
            armstrong = armstrong + (int)Math.pow(lastDigit, digits); 
            n /= 10;
        }

        return number == armstrong;
    }
}

// Time complexity: O(log10(n))
