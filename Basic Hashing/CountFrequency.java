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

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class CountFrequency {
    public static void main(String[] args) {
        int arr[] = {1, 2, 1, 3, 2};
        countFrequencyBruteForce(arr.length, arr);
        countFrequencyHashing(arr.length, arr);
        int[] hashmapResult = countFrequencyMap(arr.length, arr);
        System.out.println(Arrays.toString(hashmapResult));

    }

    // brute force solution O(n^2)
    public static void countFrequencyBruteForce(int n, int []nums){
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

    // hashing: use of pre-compute and then fetch.
    // So, with this method, we can solve the problems where the array is within a specific size. 
    public static void countFrequencyHashing(int n, int[] nums) {
        int[] hash = new int[n+1]; // + 1 because arrays are 0 indexed
        // pre-compute (store)
        for(int i = 0; i < n; i++){
            hash[nums[i]] += 1;
        }

        int[] numbers = Arrays.stream(nums).distinct().toArray();

        for(int i = 0; i < numbers.length; i++){
            System.out.println(numbers[i]  + " " +hash[numbers[i]]);
        }
    }

    // Hashmap: is an unordered map where we store values in a map, but on an unordered way, where then we can access those values
    // the benefit of using hashmap is that time complexity is O(1) in average and best cases, but O(n) in the worst case
    public static int[] countFrequencyMap(int n, int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        // pre-compute (store)
        for(int i = 0; i < n; i++){
            int key = nums[i];
            int freq = 0;
            if (map.containsKey(key)) freq = map.get(key); // if key exists, get the current frequency from the map
            freq++;
            map.put(key, freq); // add/update the key/value
        }

        // fetch
        for(Map.Entry<Integer, Integer> i : map.entrySet()) {
            System.out.println(i.getKey() + " -> " + i.getValue());
        }

        // map -> collection -> array
        Collection<Integer> values = map.values();
        int[] result = values.stream().mapToInt(x -> x).toArray();
        return result;
    }
}
