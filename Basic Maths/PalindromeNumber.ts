/*
 * Given an integer x, return true if x is a palindrome , and false otherwise.

Example 1:

Input: x = 121
Output: true
Explanation: 121 reads as 121 from left to right and from right to left.
Example 2:

Input: x = -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
Example 3:

Input: x = 10
Output: false
Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
 */

function palindromeNumber(n: number) {
    let reversedNumber = 0;
    let originalNum = n;
    while(n != 0) {
        let lastDigit = n % 10;
        reversedNumber = reversedNumber * 10 + lastDigit;
        n = Math.floor(Math.abs(n) / 10) * Math.sign(n);
    }

    console.log(originalNum == reversedNumber);
}

palindromeNumber(121);
palindromeNumber(-121);
palindromeNumber(10);