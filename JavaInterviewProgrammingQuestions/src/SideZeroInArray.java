import java.util.Arrays;

public class SideZeroInArray {

    public static void main(String[] args)
    {
        int [] ar= {1,0,2,0,3,0,0,0};
        int count=0;
        int [] newArray= new int[ar.length];
        for(int number :ar)
        {
            if(number!=0)
            {
                newArray[count]=number;
                count++;
            }
        }
        System.out.print(Arrays.toString(newArray));
    }
}
