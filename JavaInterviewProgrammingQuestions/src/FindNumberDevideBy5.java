import java.util.Arrays;

public class FindNumberDevideBy5 {

    public static void main(String[] args)
    {
        Integer[] arr={2,3,6,8,7,9,5,12,15,18,21,25};

        Object[] at=Arrays.asList(arr).stream().filter(e->e%5==0).toArray();
        System.out.print(Arrays.toString(at));
    }
}
