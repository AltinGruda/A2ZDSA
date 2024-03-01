/*
 * Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.

Assume the environment does not allow you to store 64-bit integers (signed or unsigned).

Example 1:
Input: x = 123
Output: 321

Example 2:
Input: x = -123
Output: -321

Example 3:
Input: x = 120
Output: 21
 */
public class ReverseInteger {
    public static void main(String[] args) {
        System.out.println(reverse(123));
        System.out.println(reverse(-123));
        System.out.println(reverse(120));
    }

    public static int reverse(int n) {
        int reversedNumber = 0;
        while(n != 0) {
            int lastNumber = n % 10;
            reversedNumber = reversedNumber * 10 + lastNumber;
            if(reversedNumber > Integer.MAX_VALUE / 10) return 0;
            if(reversedNumber < Integer.MIN_VALUE / 10) return 0;
            n /= 10;
        }
        
        return reversedNumber;
    }
}

// Time complexity of the code is O(log10(n))
