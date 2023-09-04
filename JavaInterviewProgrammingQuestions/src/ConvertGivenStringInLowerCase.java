public class ConvertGivenStringInLowerCase {

//    Note - ASCII values of A-Z are 65-90. And ASCII values of a-z are 97-122.
//    Note - ASCII value of 'a' is 97, whereas the ASCII value of 'A' is 65.
//    Means the ASCII value of lowercase character to its equivalent uppercase, is 32 more.
//    Therefore, adding 32 to the ASCII value of an uppercase character, becomes the ASCII value
//    of its equivalent lowercase character.


    public static void main(String[] args)
    {
        String str="aPpLe";
        String st="";
       char[] ch= str.toCharArray();
        for(int i=0;i<ch.length;i++)
        {
            if(ch[i] >= 'A' && ch[i] <= 'Z')
            {
                int a=ch[i];
                char c=(char)(a+32);
                st=st+c;
            }
            else
                st=st+ch[i];

        }
        System.out.print(st);

    }
}

