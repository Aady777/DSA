// find the number that appeared once in the array and other twice

package basics;

public class number_once {
    public static void main(String[] args) {
        int arr[] = new int[]{1,1,2,4,4,5,5,6,6};

        int xor=0;
        for(int i = 0 ; i<arr.length; i++)
        {
            xor = xor^arr[i];
        }

        System.out.println(xor);
    }
    
}
