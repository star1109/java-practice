package polymorphism;

public class MethodOverLoading
{
    /*
   1. with different types of parameters we can achive method overloading
   2. with different numbers of parameters
   3. with changing the sequence of the prameters.
     */
    public void m1(int a)
    {
        System.out.println(a);
    }

    public void m1(String name)
    {
        System.out.println(name);
    }

    public void m1(int a ,int b)
    {
        System.out.println(a+b);
    }

    public void m2(int a, String name)
    {

    }
    public void m2(String name,int a)
    {

    }

    public static void main(String[] args) {
        MethodOverLoading obj = new MethodOverLoading();
        obj.m1(1);
        obj.m1(1,2);
    }
}
