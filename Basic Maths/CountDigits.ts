/*
 * Problem statement
You are given a number ’n’.
Find the number of digits of ‘n’ that evenly divide ‘n’.
Example:
Input: ‘n’ = 336
Output: 3
 * 
 */
function countDigits(n: number) {
    let count = 0;
    let number = n;
    while(n > 0) {
        let lastDigit = n % 10;
        if(lastDigit == 0) {
            n /= 10;
            continue;
        }
        if(number % lastDigit == 0) {
            count++;
        }
        n /= 10;
    }

    console.log(count);
}

countDigits(336);

// Time complexity: O(log10(n))