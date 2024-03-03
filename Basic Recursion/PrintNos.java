/*
 * Problem statement
You are given an integer ‘n’.

Your task is to return an array containing integers from 1 to ‘n’ (in increasing order) without using loops.

Example:
Input: ‘n’ = 5

Output: 1 2 3 4 5

Explanation: An array containing integers from ‘1’ to ‘n’ is [1, 2, 3, 4, 5].
 */
public class PrintNos {
    public static void main(String[] args) {
        int[] result = printNos(5);
        for(int i = 0; i < printNos(5).length; i++){
            System.out.println(result[i]);
        }
    }

    public static int[] printNos(int x) {
        int[] arr = new int[x];
        addElements(x, arr);

        return arr;
    }

    public static void addElements(int x, int[] arr){
        if(x == 0) return;
        arr[x-1] = x;
        addElements(x-1, arr);
    }
}
