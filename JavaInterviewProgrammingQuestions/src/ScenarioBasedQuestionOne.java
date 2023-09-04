import java.util.Scanner;

public class ScenarioBasedQuestionOne {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int value=sc.nextInt();
        System.out.print(getValue(value));
    }

    public static String getValue(int val)
    {
        String str=null;
        for (int i=0;i<=100;i++)
        {
            if(i%3==0 && i%5==0)
                System.out.print(str="FizzBuzz ");
            else if(i%3==0)
                System.out.print(str="Fizz ");
            else if(i%5==0)
                System.out.print(str="Buzz ");
        }
        return str;
    }
}
