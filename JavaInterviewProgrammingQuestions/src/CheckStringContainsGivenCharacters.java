import java.util.Scanner;

public class CheckStringContainsGivenCharacters {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        String one=sc.nextLine();
        String second=sc.nextLine();
        System.out.print(CheckStringContains(one,second));
    }
    public static boolean CheckStringContains(String in, String Out)
    {
        if(in.contains(Out))
            return true;
        else
            return false;
    }
}
