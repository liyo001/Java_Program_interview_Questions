public class PrintNumber1to100WithoutUsingLoop {

    public static void main(String[] args)
    {
        printnumber(1, 100);
    }

    public static void printnumber(int start, int end)
    {
        if(start<=end)
        {
            System.out.println(start);
            start++;
            printnumber(start,end);
        }
    }
}
