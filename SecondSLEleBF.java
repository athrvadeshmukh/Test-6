/* */
import java.io.*;
import java.util.Arrays;

public class SecondSLEleBF 
{
    static private void getElements(int arr[], int n)
    {
        if (n==0||n==1)
        {
            System.out.println(-1);
            System.out.println(" ");
            System.out.println(-1);
            System.out.println("\n");

        }
        Arrays.sort(arr);
        int small = arr[1];
        int large = arr[n-2];
        System.out.println("Second smallest is " + small);
        System.out.println("Secfond largestr is " + large);   
    }
    public static void main(String args[])
    {
        int arr[] ={1,2,4,6,7,5};
        int n = arr.length;
        getElements(arr,n);
    }
}
