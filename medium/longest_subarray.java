package medium;

public class longest_subarray {
    public static void main(String[] args) {
        int arr[] =  new int[]{10, 5, 2, 7, 1, 9};
        int input = 60;

        int size = arr.length;

        // int largeoutput=-1;;
        
        // for(int i = 0 ; i<size ; i++)
        // {
        //     int currsum=0;
        //     int output=0;
        //     for(int j = i ; j<size; j++)
        //     {
        //         currsum = currsum+arr[j];
        //         output++;
        //         if(currsum == input && output > largeoutput)
        //         { largeoutput = output;
        //         }if(currsum > input)
        //         {
        //             break;
        //         }
                
        //     }
        // }

        int i = 0;
        int j=0;
        int sum = 0;
        int len=0;
        int largelen = 0;
        while(j<size)
        {
            sum = sum + arr[j];
            if(sum == input)
            {
                len = j-i+1;
                if(len>largelen)
                {
                    largelen = len;
                }
                
            }
            while(sum>input && i<=j)
            {
                sum = sum-arr[i];
                i--;
            }
            j++;
        }

        System.out.println(largelen);

        
    }
    
}
