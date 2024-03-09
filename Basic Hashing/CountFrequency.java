/*
 * 
 * Problem statement
You are given an array 'arr' of length 'n' containing integers within the range '1' to 'x'.

Your task is to count the frequency of all elements from 1 to n.

Note:
You do not need to print anything. Return a frequency array as an array in the function such that index 0 represents the frequency of 1, index 1 represents the frequency of 2, and so on.
Example:
Input: ‘n’ = 6 ‘x’ = 9 ‘arr’ = [1, 3, 1, 9, 2, 7]    
Output: [2, 1, 1, 0, 0, 0]
Explanation: Below Table shows the number and their counts, respectively, in the array
Number         Count 
 1                2
 2                1
 3                1
 4                0
 5                0
 6                0
 */

public class CountFrequency {
    public static void main(String[] args) {
        int arr[] = {10, 5, 10, 15, 10, 5};
        countFrequency(arr.length, 0, arr);
    }

    public static void countFrequency(int n, int x, int []nums){
        boolean visited[] = new boolean[n];

        for(int i = 0; i < n; i++){
            if(visited[i]) {
                continue;
            }

            int count = 1;
            for(int j = i + 1; j < n; j++){
                if(nums[i] == nums[j]) {
                    visited[j] = true;
                    count++;
                }
            }
            System.out.println(nums[i] + " " + count);
        }
    }
}
