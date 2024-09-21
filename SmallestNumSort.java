/*Find the smallest element in an array

Problem Statement: Given an array, we have to find the smallest element in the array.

Examples:

Example 1:
Input: arr[] = {2,5,1,3,0};
Output: 0
Explanation: 0 is the smallest element in the array. 

Example 2: 
Input: arr[] = {8,10,5,7,9};
Output: 5
Explanation: 5 is the smallest element in the array. */

import java.util.*;

public class SmallestNumSort {

    public static void main(String args[])
    {
        int arr1[] = {2,5,1,3,0};
        System.out.println("The smallest element in array is : " + sort(arr1));

        int arr2[] = {8,10,5,7,9};
        System.out.println("The smallest element in array is : " + sort(arr2));
    }
    static int sort(int arr[])
    {
        Arrays.sort(arr);
        return arr[0];
        
    }
}