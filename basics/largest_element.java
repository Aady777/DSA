package basics;
class largest_element{
    public static void main(String[]args)
    {
        int [] arr = new int[]{5, 4 , 8, 7 ,6};
        int n = arr.length;
        int largest = arr[0];
        for(int i = 0 ; i<n ; i++)
            {
                if(arr[i]>largest)
                {
                    largest=arr[i];
                }
        }  
        System.out.println(largest);
    }
}