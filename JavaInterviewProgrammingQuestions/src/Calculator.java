import java.util.Scanner;

public class Calculator {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        double num1=sc.nextDouble();
        double num2=sc.nextDouble();
        System.out.println("Enter Operation");
        Scanner sc1= new Scanner(System.in);
        String ch=sc1.next();
        double y=0;

        switch(ch)
        {
            case "add":
                y=num1+num2;
                break;
            case "minus":
                y=num1-num2;
                break;
            case "multiple":
                y=num1*num2;
                break;
            case "devide":
                y=num1/num2;
                break;
            default:
                System.out.print("You enter wrong input");
        }
        System.out.print(y);
    }
}
