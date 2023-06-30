public class MissingnumberInarray {

    static int [] num={1,2,3,4,5,7,8,9,10};
    static int len=num.length;
    static int exp_num=num.length+1;
    static int sum=0;
    static int totalSum=(exp_num*(exp_num+1))/2;
    public static void main(String [] args)
    {

        for(int i=0;i<len;i++)
        {
            sum=sum+num[i];
        }
        System.out.println(totalSum-sum);
}

}
