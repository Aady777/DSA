package medium;

public class stock_buy_sell {
    public static void main(String[] args) {
        int arr[] = new int[]{7,1,5,3,6,4};
        int profit=0;
        int buy=arr[0];

        int currprofit=0;
        for(int i = 1 ; i<arr.length; i++)
        {
            
            if(arr[i]> buy)
            {
                currprofit = arr[i]-buy;
                if(currprofit > profit)
                {
                    profit = currprofit;
                }
                
            }else{
                buy = arr[i];
            }
        }

        System.out.println(profit);
    }
    
}
