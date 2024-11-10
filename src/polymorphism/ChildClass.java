package polymorphism;

public class ChildClass extends ParentClass
{
    public void m1(int a,int b,int c)
    {
        System.out.println(a-b);
        System.out.println(a+b);
        System.out.println(a*b);
        System.out.println(a*b);
    }

    public static void main(String[] args) {
        ChildClass obj = new ChildClass();
     obj.m1(10,10, 0);

    }
}
