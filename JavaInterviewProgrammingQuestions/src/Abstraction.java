abstract class Abstraction {

//    The abstract keyword is a non-access modifier, used for classes and methods:
//    Abstract class: is a restricted class that cannot be used to create objects
//    (to access it, it must be inherited from another class).
//    Abstract method: can only be used in an abstract class, and it does not have a body.
//    The body is provided by the subclass (inherited from).

//    An abstract class must be declared with an abstract keyword.
//    It can have abstract and non-abstract methods.
//    It cannot be instantiated.
//    It can have constructors and static methods also.
//    It can have final methods which will force the subclass not to change the body of the method.

    public abstract void animalSound();
    public void sleep() {
        System.out.println("Zzz");
    }

    //it is not possible to create an object of the Animal class. To access the abstract class,
    // it must be inherited from another class.


}