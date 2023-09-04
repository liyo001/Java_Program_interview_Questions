public class RemoveWhiteSpaceFromGivenString {
    public static void main(String[] args)
    {
       String str="Java is the programming language";
       String st=" Tarun And Aparna ";
       String modifiedString="";
       char[] ch=str.toCharArray();
       for(char c:ch)
       {
           if(!Character.isWhitespace(c))
               modifiedString=modifiedString+String.valueOf(c);
       }
       System.out.println(modifiedString);
       String at=st.strip();
       System.out.println(at);
    }
}
