package medium;
import java.util.*;

public class two_sum {
    public static void main(String[] args) {
        int arr[] = new int[]{2,6,5,8,11};

        int size = arr.length;

        int input = 20;
        int flag=0;

        // for(int i = 0 ; i<size ; i++)
        // {
        //     for(int j = 0 ; j<size; j++)
        //     {
        //         if(i!=j && arr[i]+arr[j] == input)
        //         {
        //             System.out.println("Yes");
        //             System.out.println(i+" "+j);
        //             flag=1;
        //             break;
        //         }
        //     }
        // }
        // if(flag==0)
        // {
        //     System.out.println("no");



        HashMap<Integer, Integer>map = new HashMap<>();

        for(int i = 0; i<size; i++)
        {
            int remaining = input-arr[i];
            if(map.containsKey(remaining))
            {
                int index = map.get(remaining);
                System.out.println(i+""+  index);
            }
            map.put(arr[i],i);
        }

    }
    
}
