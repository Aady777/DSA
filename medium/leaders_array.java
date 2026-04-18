package medium;
import java.util.*;

public class leaders_array {
    public static void main(String[] args) {
        int arr[] = new int[]{10, 22, 12, 3, 0, 6};

        int num = arr.length;

        int max = Integer.MIN_VALUE;

        for(int i = num-1; i>=0 ; i--)
        {
            if(arr[i] > max)
            {
                System.out.println(arr[i]);
                max = arr[i];
            }
        }
        
    }
}