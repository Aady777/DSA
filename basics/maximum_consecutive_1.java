package basics;

public class maximum_consecutive_1 {
    public static void main(String[] args) {
        int arr[] = new int[]{1,1,0,1,1,1};

        int n=0;
        int sum=0;
        for(int i=0; i <arr.length; i++)
        {
            if(arr[i] == 1)
            {
                n=n+1;

            }
            if(n>sum)
                {
                    sum=n;
                }
            if(arr[i] == 0)
            {
                
                n=0;
            }
        }

        System.out.println(sum);
    }
    
}
