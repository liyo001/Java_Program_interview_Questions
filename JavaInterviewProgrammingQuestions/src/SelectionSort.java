import java.util.Arrays;

public class SelectionSort {
    public static void main(String [] args)
    {
        int [] are={4,1,2,7,9,3};
        int temp;
        int minIndex;
        for (int i=0;i<are.length;i++)
        {
            minIndex=i;
            for (int j=i;j<are.length;j++)
            {
                if(are[j]<are[minIndex])
                {
                    temp=are[minIndex];
                    are[minIndex]=are[j];
                    are[j]=temp;
                }
            }
        }
        System.out.print(Arrays.toString(are));
    }
}
