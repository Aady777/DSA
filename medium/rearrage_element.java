package medium;

public class rearrage_element {
    public static void main(String[] args) {
        int arr[] = new int[]{1,2,-3,-1,-2,3};
        int pos = 0;
        int neg=1;

        int arr1[] = new int[arr.length];

        for(int i = 0 ; i<arr.length; i++)
        {
            if(arr[i]>0)
            {
                arr1[pos] = arr[i];
                pos = pos+2;
                
            }else{
                arr1[neg]=arr[i];
                neg = neg+2;
            }
        }

        for(int i = 0 ; i<arr1.length; i++)
        {
            System.out.print(arr1[i]+" ");
        }
    }
    
}
