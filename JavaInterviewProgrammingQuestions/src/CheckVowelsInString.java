import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CheckVowelsInString {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        String input=sc.nextLine();
        List lt=checkVowel(input);
        System.out.print(lt);
    }

    public static List checkVowel(String str)
    {
        str=str.toLowerCase();
        List<Character> li= new ArrayList();
        for (int i=0;i<str.length();i++)
        {
            if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
            {
               li.add(str.charAt(i));
            }
        }
        return li;
    }
}
