package inheritance;

public class ChildClass extends ParentClass
{
    public void m3()
    {
        m1();
        System.out.println("child class m3 method");
    }

    public void m4()
    {
        System.out.println("child class m4 method");
    }


    private void m2()
    {
        System.out.println("child class m2 method");
    }

    public static void m8()
    {
        System.out.println("m8 method static child class");
    }
//    public static void main(String[] args) {
//        ChildClass obj1 = new ChildClass();
//        obj1.m3();
//        obj1.m4();
//        obj1.m1();
//        obj1.m2();
//
//        ParentClass obj2 = new ParentClass();
//      obj2.m1();
//      obj2.m2();
    }

