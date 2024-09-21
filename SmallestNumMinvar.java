/*Problem Statement: Given an array, we have to find the smallest element in the array.

Examples:

Example 1:
Input: arr[] = {2,5,1,3,0};
Output: 0
Explanation: 0 is the smallest element in the array. 

Example2: 
Input: arr[] = {8,10,5,7,9};
Output: 5
Explanation: 5 is the smallest element in the array. */


public class SmallestNumMinvar 
{
    public static void main(String args[])
    {
        int arr1[] =  {2,5,1,3,0};
        System.out.println("The smallest element in the array is : "+ SmallestElement(arr1));

        int arr2[] = {8,10,5,7,9};
        System.out.println("The smallest element in the array is : "+ SmallestElement(arr2));

    }
    static int SmallestElement(int arr[])
    {
        int min = arr[0];
        for(int i = 0; i<arr.length; i++)
        {
            if (arr[i]<min)
            {
                min = arr[i];
            }
        }
        return min;
    }
    
}
