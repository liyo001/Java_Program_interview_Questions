public class FindMinAndMaxInUnsortedArray {

    public static void main(String[] args) {
        int[] it = {-12, 1, 4, 7, 8, 32, 50};

        int min = it[0];
        int max = it[0];
        for (int i = 0; i < it.length; i++) {
            if (it[i] < min) {
                min = it[i];
            }
            if (it[i] > max) {
                max = it[i];
            }

        }
        System.out.print(min + " " + max);
    }
}
