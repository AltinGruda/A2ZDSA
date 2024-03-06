/* 
 * Problem statement
Determine if a given string ‘S’ is a palindrome using recursion. Return a Boolean value of true if it is a palindrome and false if it is not.

Note: You are not required to print anything, just implement the function. Example:
Input: s = "racecar"
Output: true
Explanation: "racecar" is a palindrome.
 */

public class IsPalindrome {
    public static void main(String[] args) {
        String str = "skdpnyegmds";
        System.out.println(isPalindrome(str, 0, str.length()-1));

        System.out.println(isPal(str));
    }

    // option 1
    public static boolean isPalindrome(String str, int start, int end) {
        if(start < end) {
            if(str.charAt(start) == str.charAt(end)) {
                return isPalindrome(str, start+1, end-1);
            } else {
                return false;
            }
        }
        return true;
    }

    // option 2
    public static boolean isPalindromeHelper(String str, int left, int right) {
        if(left < right) {
            if(str.charAt(left) == str.charAt(right)) {
                return isPalindromeHelper(str, left + 1, right - 1);
            } else {
                return false;
            }
        }
        return true;
    }

    public static boolean isPal(String str) {
        return isPalindromeHelper(str, 0, str.length()-1);
    }
}
