public class FindLongestPalindromInString {

    public static void main(String[] args)
    {
        String str="thequickbrownfoxxofnworbquickthe";
        int max=0;
        String tot="";
        for(int i=0;i<str.length();i++)
        {
            for(int j=i+1;j<str.length();j++)
            {
                String st=str.substring(i,j);
                String rev= new StringBuffer(st).reverse().toString();
                if(st.equals(rev))
                {
                    if(max<str.substring(i,j).length())
                    {
                        max=str.substring(i,j).length();
                        tot=str.substring(i,j);
                    }
                }
            }
        }
        System.out.print(tot);
    }
}
