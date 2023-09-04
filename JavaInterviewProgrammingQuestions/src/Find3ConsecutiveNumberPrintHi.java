public class Find3ConsecutiveNumberPrintHi {
    public static void main(String [] args)
    {
        int [] arr= {1,2,3,5,8,9,11,12,13,14,15,18,19,20};
        for(int i=0;i<arr.length-2;i++)
        {
                int n1 = arr[i];
                int n2 = arr[i + 1];
                int n3 = arr[i + 2];
                if (n1 + n2 == n3)
                    System.out.println("Hi");
        }

    }
}
