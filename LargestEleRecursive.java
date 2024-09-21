/*Problem Statement: Given an array, we have to find the largest element in the array.

Examples
Example 1:
Input:
 arr[] = {2,5,1,3,0};
Output:
 5
Explanation:
 5 is the largest element in the array. 

Example2:
Input:
 arr[] = {8,10,5,7,9};
Output:
 10
Explanation:
 10 is the largest element in the array.  */


public class LargestEleRecursive 
{
    public static void main(String args[])
    {
        int arr1[] =  {2,5,1,3,0};
        System.out.println("The largest element in the array is : "+ LargestElement(arr1));

        int arr2[] = {8,10,5,7,9};
        System.out.println("The largest element in the array is "+ LargestElement(arr2));

    }
    static int LargestElement(int arr[])
    {
        int max = arr[0];
        for(int i=0; i<arr.length-1; i++)
        {
            if(arr[i]>max)
            {
               max = arr[i];
            }
        }
        return max;
    }    
}
