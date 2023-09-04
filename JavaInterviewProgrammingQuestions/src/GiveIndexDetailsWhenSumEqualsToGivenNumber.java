public class GiveIndexDetailsWhenSumEqualsToGivenNumber {

    public static void main(String[] args)
    {
        int[] arr={5,4,9,6};
        int sum=10;
        for(int i=0;i<arr.length;i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] + arr[j] == sum)
                    System.out.print(i + " " + j);

            }
        }
    }
}
