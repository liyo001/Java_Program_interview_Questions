public class ReverseStringWithoutChangePosition {

    public static void main(String[]args)
    {
        String str="I love java programming";
        String words[] =str.split(" ");
        String reverseString="";

        for(int i=0;i< words.length;i++)
        {
            String word=words[i];
            String reverse="";
            for(int j=word.length()-1;j>=0;j--)
            {
                    reverse=reverse+word.charAt(j);
            }
            reverseString = reverseString + reverse + " ";
        }
        System.out.print("Reversed string : " + reverseString);
    }
}
