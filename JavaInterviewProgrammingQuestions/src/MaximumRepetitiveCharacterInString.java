public class MaximumRepetitiveCharacterInString {
    public static void main(String [] args)
    {
        String str="Great responsibility";
        str=str.replaceAll("\\s","");

        int [] at= new int[127];

        for(int i=0;i<str.length();i++)
        {
            at[str.charAt(i)]=at[str.charAt(i)]+1;
        }

        int max=-1;
        char c= 0;

        for(int i=0;i<str.length();i++)
        {
            if(max<at[str.charAt(i)])
            {
                max=at[str.charAt(i)];
               c= str.charAt(i);
            }
        }
        System.out.print(c);
    }
}
