import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MoveNegativeAndPostiveNumberOneSide {

    public static void main(String[] args)
    {
        Integer arr[] = { 2,4,-10,13,-7,-60,52,8,-19 };
        List<Integer> li=Arrays.asList(arr).stream().sorted().collect(Collectors.toList());
        System.out.println(li);

        System.out.println("===================================================================");

        int j=0; int temp;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<0)
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
        System.out.println(Arrays.toString(arr));
    }
}
