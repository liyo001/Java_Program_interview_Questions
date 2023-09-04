import java.util.Scanner;

public class FindPrimeNumber {

    public static void main(String[]args)
    {
        Scanner sc= new Scanner(System.in);
        boolean bc=checkPrime(sc.nextInt());
        System.out.print(bc);
    }

    public static boolean checkPrime(int in)
    {
        if(in==0||in==1)
            return false;
        if(in==2)
            return true;
        for(int i=2;i<=in/2;i++)
        {
            if(in%i==0)
            {
                return false;
            }
        }
        return true;
    }

}
