package basics;
import java.util.*;

public class union_array {
    public static void main(String[] args) {
        int arr1[] = new int[]{1, 2 , 3 , 5, 5,6};
        int arr2[] = new int[]{1,7,5,9,8};

        Set<Integer>st= new HashSet<>();
        for(int i = 0; i<arr1.length;i++)
        {st.add(arr1[i]);

        }

        for(int j = 0 ; j<arr2.length; j++)
        {
            st.add(arr2[j]);
        }

        int union[] = new int[st.size()];
        int i=0;
        for(int num:st)
        {
            union[i++] = num;
            System.out.print(num+" ");
        }

    }
    
}
