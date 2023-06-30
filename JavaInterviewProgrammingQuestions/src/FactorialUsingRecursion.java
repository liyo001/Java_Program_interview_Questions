public class FactorialUsingRecursion {

     static int fact =1;

     public static void main(String []args)
     {
         int no=4;
    FactorialUsingRecursion ob= new FactorialUsingRecursion();
    ob.calFact(no);
    System.out.println(fact);
}
public void calFact(int no)
{
if(no>=1)
{
    fact=fact*no;
    calFact(no-1);
}
}
}
