package abstraction;

public  class ChildClass extends Prime2
{
    public  boolean m2()
    {
        return true;
    }

//    public  int m1(int a, int b)
//    {
//        return a-b;
//    }

    public static void main(String[] args) {
        ChildClass c1 = new ChildClass();
        System.out.println(c1.m1(10,20));
        System.out.println(c1.m2());
        c1.m3();


    }


}
