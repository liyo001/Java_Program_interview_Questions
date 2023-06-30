import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class ArraySort {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        int temp;

        Integer[] str = {90, -78, 56, 0, 12};

        for (int i = 0; i < str.length; i++) {
            for (int j = i + 1; j < str.length; j++) {

                if (str[i] > str[j]) {
                    temp = str[i];
                    str[i] = str[j];
                    str[j] = temp;

                }

            }

        }
        System.out.println(Arrays.toString(str));

        //Sort array in descending order.
        Arrays.sort(str, Collections.reverseOrder());
        System.out.println(Arrays.toString(str));

        //Java 8 Stream
        Arrays.asList(str).stream().sorted().forEach(value->System.out.print(value+" "));
        Object[] at=Arrays.asList(str).stream().sorted().toArray();
        System.out.println(Arrays.toString(at));
        for (Object o:at) {
            System.out.print(o+" ");
        }
        Arrays.asList(str).stream().sorted(Comparator.reverseOrder()).forEach(value->System.out.println(value+" "));
    }

}

//Note