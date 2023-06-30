import java.util.HashSet;

public class ExtractNumbers {

    static String str="1,2,3,4,5,6,7,6,5,A,b,C,r,4,3,2,r,h,g,d,3,4,5,6,6,3,2,1";

   static HashSet<Character> it= new HashSet<>();
    public static void main(String[]args)
    {
    for(int i=0;i<str.length();i++)
    {
        if(Character.isDigit(str.charAt(i)))
        {it.add(str.charAt(i));
        }
    }
        System.out.print(it);
    }
}
