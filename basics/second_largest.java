package basics;

public class second_largest {

    public static void main(String[] args) {
        int arr[] = new int[]{1, 8 , 7 , 6 ,4, 3};
        int n = arr.length;
        int largest = arr[0];
        int slargest = Integer.MIN_VALUE;

        for(int i = 1 ; i <n ; i++)
        {
            if(arr[i]>largest)
            {
                slargest = largest;
                largest = arr[i];
            }else if(arr[i]<largest && arr[i]>slargest)
            {
                slargest = arr[i];
            }
        }

        System.out.println(slargest);
    }
    
}
