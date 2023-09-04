public class Overriding {

    public static void main(String [] args)
    {
        Parent p= new Parent();
        p.displayInfo();
        System.out.println(p.a);
        Parent p1= new Child();
        p1.displayInfo();
        System.out.print(p1.a);
        p1.table();
        Child c= new Child();
        c.Info();
        System.out.print(c.a);

        //Note: Access modifier should not lower or restricted in child as compare to parent.
        // means if parent class have public method then child class method should public for overriding. If We will
        // make it protacted, default or private then we will get compile time error.

    }
}
