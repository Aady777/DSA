package medium;
import java.util.*;

public class dutch_national{
    public static void main(String[] args) {
        int arr[] = new int[]{0,1,2,0,1,2,0,0,0,1,2};
        int low = 0;
        int mid=0;
        int high=arr.length-1;

        while(mid<=high)
        {
            if(arr[mid] == 0)
            {
                
                arr[mid] = arr[low];
                arr[low]=0;
                low++;
                mid++;
                
            }else if(arr[mid] == 1)
            {
                mid++;
            }else
            {
                arr[mid]=arr[high];
                arr[high]=2;
                high--;
                
            }
        }

        for(int i = 0 ; i<arr.length; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}