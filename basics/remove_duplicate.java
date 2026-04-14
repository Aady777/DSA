package basics;
public class remove_duplicate {

    public static void main(String[] args) {
        int arr[] = new int[]{1,1,2,2,2,3,3};
        int n = arr.length;
        int i = 0;
        for(int j = 1; j<n;j++)
        {
            if(arr[j]!=arr[i])
            {
                arr[i+1] = arr[j];
                i++;
            }
        }
        System.out.println(++i);
        for(int k = 0 ;k<n;k++)
        {
            System.out.println(arr[k]);
        }
    }
    
}
