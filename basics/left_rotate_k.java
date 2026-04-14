package basics;

public class left_rotate_k {

    static void reverse(int arr[] , int i ,int  j)
    {
       while(j>i)
       {
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        i++;
        j--;
       }
       

    }
    public static void main(String[] args) {
        int arr[] = new int[]{1, 2 , 3 , 4 , 5};
        int k = 3 ;
        reverse(arr, 0, k-1);
        reverse(arr,k,arr.length-1);
        reverse(arr,0,arr.length-1);

        for(int i= 0 ; i< arr.length; i++)
        {
            System.out.print(arr[i]+ " ");

        }
       
    }
    
}
