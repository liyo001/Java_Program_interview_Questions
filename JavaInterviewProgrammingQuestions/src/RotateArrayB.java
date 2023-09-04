import java.util.Arrays;
import java.util.Scanner;

public class RotateArrayB {

    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int k=sc.nextInt();
        int[] arr={3,4,6,8,9,2,11};
        for(int i=1;i<k;i++)
        {
            int temp=arr[0];
            for (int j=1;j<arr.length;j++)
            {
                arr[j-1]=arr[j];
            }
            arr[arr.length-1]=temp;
        }
        System.out.print(Arrays.toString(arr));
    }
}
