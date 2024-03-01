/*
 * Problem statement
You are given a number ’n’.
Find the number of digits of ‘n’ that evenly divide ‘n’.
Example:
Input: ‘n’ = 336
Output: 3
 * 
 */

public class CountDigits {
    public static void main(String[] args) {
        System.out.println(countDigits(336));
        System.out.println("Optimal solution:" + optimalSolution(336));
    }

    public static int countDigits(int n){
        int count = 0;
        int number = n;
        while(n > 0){
            int lastDigit = n%10;
            if(lastDigit == 0) {
                n /= 10;
                continue;
            }
            if(number % lastDigit == 0) {
                count++;
            }
            n /= 10;
        }
        return count;
    }

    public static int optimalSolution(int n){
        int result = (int) (Math.log10(n) + 1);
        return result;
    }
}

// Time complexity of the code is O(log10(n)) because the loop runs each time n/10
// You can understand it as: how many steps are taken to divide the original number by 10, so it becomes 0. 
// Time complexity of the optimalSolution function is O(1)