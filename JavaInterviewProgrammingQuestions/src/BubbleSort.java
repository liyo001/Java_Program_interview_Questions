import java.util.Arrays;

public class BubbleSort {

    public static void main(String []args)
    {
        int [] arr={4,8,10,1,5,9,2,7,3};

        int temp;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=1;j<arr.length-i;j++)
            {
                if(arr[j]<arr[j-1])
                {
                    temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
            }
        }

        System.out.print(Arrays.toString(arr));
    }
}
