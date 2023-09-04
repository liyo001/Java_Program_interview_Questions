import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConvertListToArray {
    public static void main(String[] args)
    {
        List<String> ls1= new ArrayList<>();
        ls1.add("tarun");
        ls1.add("ram");
        ls1.add("aman");
        ls1.add("raju");

        List<Integer> ls= new ArrayList<>();
        ls.add(1);
        ls.add(2);
        ls.add(3);
        ls.add(4);

        Integer[] st=ls.toArray(Integer[]::new);

        System.out.print(Arrays.toString(st));

    }
}
