public class ReversStringWithoutChangeSpecialCharacterPlace {

    // expected output=“PeD$cb#A&”;
    public static void main(String [] args)
    {
        String str="Abc$De#P&";
        char[]ch=str.toCharArray();
        int j= ch.length-1;

        for(int i=0;i<j;)
        {
            if(!Character.isAlphabetic(ch[i]))
                i++;
            else if(!Character.isAlphabetic(ch[j]))
                j--;
            else
            {
                char temp=ch[i];
                ch[i]=ch[j];
                ch[j]=temp;
                i++;
                j--;
            }
        }

        System.out.print(ch);
    }
}
