public class FindTheSumOfFirstAndLastEqualToMiddle {
    public static void main (String[]args)
    {
       // Ex:- 121,132,143,165,176
        for(int i=100;i<=200;i++) {
            int firstDigit = i / 100;
            int secondDigit = (i / 10) % 10;
            int thirdDigit = i % 10;
           if(firstDigit+thirdDigit==secondDigit)
           {
               System.out.println(i);
           }
        }
    }
}
