import java.util.Arrays;

public class RemoveZeroFromArray {


//   static int [] val={2,4,0,5,7,0,9,11,18};

    public static void main(String []args)
    {
        Integer[] test = {1, 0, 4, 7, 0, 2, 10, 82, 0,92,0,32,0,22};
        Integer[] intResult = new Integer[test.length];
        int length = 0;
        for (int i=0; i<test.length; i++){
            if (test[i] > 0) {
                intResult[length] = test[i];
                length++;
            }
        }
        if(length > 0) {
            intResult = Arrays.copyOf(intResult, length);
            System.out.print(Arrays.toString(intResult));
        }


        Arrays.asList(test).stream().filter(num->(num>0)).forEach(num->System.out.print(num+" "));
    }


}
