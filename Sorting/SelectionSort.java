/* 
 * Given an array of N integers, write a program to implement the Selection sorting algorithm.
 * 
 * Example 1:
Input: N = 6, array[] = {13,46,24,52,20,9}
Output: 9,13,20,24,46,52
Explanation: After sorting the array is: 9, 13, 20, 24, 46, 52

Example 2:
Input: N=5, array[] = {5,4,3,2,1}
Output: 1,2,3,4,5
Explanation: After sorting the array is: 1, 2, 3, 4, 5
 */

import java.util.Arrays;

public class SelectionSort{

    public static void main(String[] args) {
        int[] array = {13,46,24,52,20,9};
        int[] sortedArray = selectionSort(array.length, array);

        System.out.println(Arrays.toString(sortedArray));
    }

    // Algorithm: find the minimum of the subarray, swap it with the first element of the subarray
    public static int[] selectionSort(int n, int[] arr) {
        for(int i = 0; i < n - 1; i++){
            int min = i;
            for(int j = i + 1; j < n; j++){
                if(arr[j] < arr[min]) {
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }

        return arr;
    }
}