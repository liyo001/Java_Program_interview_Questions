public class FetchIntegerFromCharacterAndSum {
    public static void main (String[] args)
    {
        String s="ab12c34d5e6";
        int sum=0;
       char []ch= s.toCharArray();

       for(char c:ch)
       {
           if(Character.isDigit(c))
           {
               sum=sum+Character.getNumericValue(c);
               sum=sum+c-'0';
           }
       }
       System.out.print(sum);

    }
}
