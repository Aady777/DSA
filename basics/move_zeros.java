package basics;
public class move_zeros{
    public static void main(String args[])
    {
        int arr[] = new int[]{1,0,2,3,0,0,4,0,5,0};
        int j=0;
        int i;
        while(true)
        {
            if(arr[j] == 0)
            {
                i = j;
                break;
                

            }
            j++;

        }

        for(int n = i+1;n<arr.length; n++)
        {
            if(arr[n]!=0)
            {
                arr[i]=arr[n];
                arr[n]=0;
                i++;
            }

        }

        for(int m = 0 ; m<arr.length; m++)
        {
            System.out.print(arr[m]+" ");
        }
    }

}