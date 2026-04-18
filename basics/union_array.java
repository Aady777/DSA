package basics;
import java.util.*;

public class union_array {
    public static void main(String[] args) {
        int arr1[] = new int[]{1, 2 , 3 , 5, 5,6};
        int arr2[] = new int[]{1,7,5,9,8};
        int n1=arr1.length;
        int n2=arr2.length;
        int i=0;
        int j=0;

        Vector<Integer>union = new Vector<>();
        while(i<n1 && j<n2)
        {
            if(arr1[i]<= arr2[j])
            {
                if(union.size()==0 || union.lastElement()!=arr1[i])
                {
                    union.add(arr1[i]);
                    
                }
                i++;
            }
            else{
                if(union.size()==0 || union.lastElement()!=arr2[j])
                {
                    union.add(arr2[j]);
                    
                }
                j++;
            }
        }

        while(j<n2)
        {
            if(union.size()==0 || union.lastElement()!=arr2[j])
                {
                    union.add(arr2[j]);
                    
                }
                j++;

        }

        while(i<n1)
        {
            if(union.size()==0 || union.lastElement()!=arr1[i])
                {
                    union.add(arr1[i]);
                    
                }
                j++;
        }

        // Set<Integer>st= new HashSet<>();
        // for(int i = 0; i<arr1.length;i++)
        // {st.add(arr1[i]);

        // }

        // for(int j = 0 ; j<arr2.length; j++)
        // {
        //     st.add(arr2[j]);
        // }

        // int union[] = new int[st.size()];
        // int i=0;
        // for(int num:st)
        // {
        //     union[i++] = num;
        //     System.out.print(num+" ");
        // }





    }
    
}
