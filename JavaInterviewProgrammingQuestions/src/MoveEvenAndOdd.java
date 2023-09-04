import java.util.Arrays;

public class MoveEvenAndOdd {
    public static void main(String[] args) {
        int[] it = {6, 5, 7, 2, 9};
        int j = 0;
        int temp;
        for (int i = 0; i < it.length; i++) {
            if (it[i] % 2 == 0) {
                if(i!=j) {
                    temp = it[i];
                    it[i] = it[j];
                    it[j] = temp;
                }
                j++;
            }
        }
        System.out.println(Arrays.toString(it));
    }
}
