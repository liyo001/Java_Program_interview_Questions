import java.util.Arrays;

public class MoveRightZeroAndOneLeft {
    public static void main(String [] args)
    {
        int arr[] = new int[]{ 0, 0, 1, 1, 0, 1, 1, 1,0 };
        int j=0;
        int temp;

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==1)
            {
                if(i!=j)
                {
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                }
                j++;
            }
        }
        System.out.print(Arrays.toString(arr));
    }
}

