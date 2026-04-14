package basics;
public class left_rotate{
    public static void main(String[] args) {
        int arr[] = new int[]{1 , 5 , 4 , 8, 9};
        int j = arr[0];
        for(int i = 0 ; i<arr.length-1;i++)
        {
            arr[i]=arr[i+1];
        }
        arr[arr.length-1] = j;

        for(int s = 0 ; s<arr.length;s++ )
        {
            System.out.print(arr[s]+" ");
        }
    }
}