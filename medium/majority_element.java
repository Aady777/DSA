package medium;
import java.util.*;

public class majority_element {
    public static void main(String[] args) {
        int arr[] = new int[]{7,0,0,1,7,7,2,7,7};

        int count=1;
        int num = arr[0];
        for(int i=1; i<arr.length; i++)
        {
            if(arr[i] != num)
            {
                count--;
                if(count == 0 )
                {
                    count++;
                    num = arr[i];
                }
            }else{
                count++;
            }
        }

        System.out.println(num);

        
        
    }
    
}
