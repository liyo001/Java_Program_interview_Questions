public class ImplementInterface implements FirstInterface{
    @Override
    public String myMethod() {
       return "Hello";
    }
    public static void main(String [] args)
    {
       System.out.println(FirstInterface.x);
       FirstInterface fc= new ImplementInterface();
       System.out.print(fc.myMethod());
    }
}
