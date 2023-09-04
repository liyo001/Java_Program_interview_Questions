public class ConceptStaticAndNonstatic {

    int a=10;
    static int b=12;

    void display()
    {
        System.out.print("Hi");
        value();
    }
    static void value()
    {
        System.out.print("Hello");
    }

    public static void main(String []args)
    {
        System.out.print(ConceptStaticAndNonstatic.b);
     ConceptStaticAndNonstatic dc= new ConceptStaticAndNonstatic();
     dc.display();
    }
}
