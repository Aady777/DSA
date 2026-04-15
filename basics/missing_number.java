package basics;

public class missing_number {
    public static void main(String[] args) {
        int arr[] = new int[]{1,2,4,5};
        int n=5;
        
        //using sum
        // int sum=(n*(n+1))/2;
        // int sum2= 0;
        // for(int i=0; i<arr.length;i++)
        // {
        //     sum2=sum2+arr[i];
        // }

        // System.out.println(sum-sum2);


        // using xor

        int xor1 = 0;
        int xor2=0;

        for(int i = 0 ; i<arr.length; i++)
        {
            xor1 = xor1^arr[i];
            xor2 = xor2^(i+1);
        }
        xor2=xor2^n;
        System.out.println(xor1^xor2);
    }
    
}
