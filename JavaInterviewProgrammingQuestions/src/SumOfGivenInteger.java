public class SumOfGivenInteger {

    public static void main(String[] args)
    {
        int reminder;
        int sum=0;
        int a=1234;
        while(a>0)
        {
            reminder=a%10;
            a= a/10;
            sum=sum+reminder;
        }
        System.out.print(sum);
    }
}
