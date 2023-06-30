public class FindMissingNumberMoreThanOne {


    public static void main(String[] args) {
        int[] it = {1, 1, 2, 2, 4, 5, 7, 8, 8};

        int[] at = new int[it.length];

        for (int i : it) {
            at[i] = 1;
        }
        for (int i = 1; i < at.length; i++) {
            if (at[i] == 0) {
                System.out.print(i);
            }
        }


    }
}
