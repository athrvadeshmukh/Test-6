public class RCRM 
{
    static int maxJumpsGrabbed(int[]a, int start, int end)
    {
        int maxVal = 0;
        int index = start;

        for(int i = start; i<=end; i++)
        {
            if (i<a.length && a[i]>maxVal)
            {
                maxVal = a[i];
                index = i;
            }
        }
        return index;
    }
    static int minJumpsReq(int[] a, int n)
    {
        if (n==1 || n==0)
        {
            return 0;
        }
        if (n>1 && a[0] == 0)
        {
            return -1;
        }

        int current = 0;
        int count = 0;
        while (current<n)
        {
            if (a [current]>=n-current-1)
            {
                return count+1;
            }
            int findMaxJump  = maxJumpsGrabbed(a, current+1, a[current]+ current);
            count++;
            current = findMaxJump;
            
            if(a[current] >= n- current -1)
            {
                return count+1;
            }
        }
        return count;


    }
    public static void main(String[] args)
    {
        int [] arr1 = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};
        int n1 = arr1.length;
        System.out.println("Min Jumps Req : "+ minJumpsReq(arr1, n1));

        int [] arr2 =  {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
        int n2 = arr2.length;
        System.out.println("Min Jumps Req : "+ minJumpsReq(arr2, n2));
    }    
}
