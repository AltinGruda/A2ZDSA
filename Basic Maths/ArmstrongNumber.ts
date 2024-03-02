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

function armstrongNumber(n: number) {
    let armstrong = 0;
    let originalNum = n;
    while(n != 0){
        let lastDigit = n % 10;
        armstrong = armstrong  + Math.pow(lastDigit, String(originalNum).length);
        n = Math.floor(n / 10); // it cant be negative so this works
    }
    console.log(armstrong);
}

armstrongNumber(371);
armstrongNumber(1634);
