import java.lang.reflect.Array;
import java.util.Arrays;

public class RemoveDuplicateFromArrayAndAddZero {


    //output- {-1,1,3,5,6,7,8,2,0,0,0,0,0,0,0,0,0}

    public static void main(String[] args) {
        Integer[] it = {-1, -1, 1, 1, 3, 3, 5, 5, 5, 6, 6, 7, 7, 8, 8, 2, 2};
        Object[] ar = Arrays.asList(it).stream().distinct().toArray();

        Integer[] ir = new Integer[it.length];
        int counter = 0;
        for (int i = 0; i < ir.length; i++) {
            if (counter < ar.length) {
                ir[i] = (Integer) ar[i];
                counter++;
            } else {
                ir[counter] = 0;
                counter++;
            }
        }
        System.out.print(Arrays.toString(ir));
    }

}
