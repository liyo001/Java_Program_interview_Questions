public class PalandromInteger {

    public static void main(String[]args)
    {
        int val=242;
        int a;
        int reminder=0;

        while(val>0) {
            a=val%10;
            reminder = (reminder * 10) + a;
            val = val / 10;
        }
        System.out.print(val);
//        if(val==reminder)
//        System.out.print("Palaindrom");
//        else
//            System.out.print("Not Palaindrom");
    }
}
