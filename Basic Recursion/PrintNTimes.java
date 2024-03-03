/*
 * Problem statement
You are given an integer ‘n’.

Print “Coding Ninjas ” ‘n’ times, without using a loop.

Example:
Input: ‘n’  = 4

Output:
Coding Ninjas Coding Ninjas Coding Ninjas Coding Ninjas 

Explanation: “Coding Ninjas” is printed 4 times. 
 * 
 */

import java.util.ArrayList;
import java.util.List;

public class PrintNTimes {
    public static void main(String[] args) {
        String str = String.join(" ",printNtimes(4));
        System.out.println(str);
    }   
    static List<String> list = new ArrayList<>();

    public static List<String> printNtimes(int n){
        print(n);
        return list;
    }

    public static void print(int n){
        if(n == 0) return;
        list.add("Coding Ninjas");
        print(n-1);
    }
}
