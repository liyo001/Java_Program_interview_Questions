public class StringPalandrom {

    public static void main(String[] args)
    {
        String str="POOP";

        //non-syncronized and not thread safe.
        StringBuilder br= new StringBuilder();
            br.append(str);
            br=br.reverse();
            if(str.equals(br.toString()))
                System.out.println("Given string is palandrom");
            else
                System.out.println("Given string is not palandrom");
    }
}
