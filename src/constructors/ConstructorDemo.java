package constructors;

public class ConstructorDemo
{
    //constructor
   public ConstructorDemo()
    {
        System.out.println("zero args constructor by user");
    }

    public ConstructorDemo(int a)
    {
        System.out.println("this is parameterised constructor" + a);
    }

    public ConstructorDemo( String s )
    {

        System.out.println("This is string type one parameterised constructor" +s);
    }

    public ConstructorDemo(int a , int b)
    {
        System.out.println("addition of a and b is "+ (a+b));
    }

    public void myMethod()
    {

    }

    public static void main(String[] args)
    {
                                // constructor is callled during the object creation
        ConstructorDemo obj = new ConstructorDemo(); // calling constructors
        ConstructorDemo obj1 = new ConstructorDemo(10);
        ConstructorDemo obj2 = new ConstructorDemo("Riyaaa");
        ConstructorDemo obj3 = new ConstructorDemo(10,20);
        obj.myMethod();
    }

}

