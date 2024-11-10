package variables;

public class InstanceVariable
{
   int a = 100;
   static int b= 200;
   String name = "prime testing"; // instance
    public static void main(String[] args)
    {
        //System.out.println();
        InstanceVariable iv = new InstanceVariable();

        System.out.println(iv.a);
        iv.test();
        test1();



    }
    public void test()
    {
        System.out.println(a);
        System.out.println(name);
    }


    public static void test1() // ststic
    {
        InstanceVariable iv1 = new InstanceVariable();
        System.out.println(iv1.a);
        System.out.println(iv1.name);

    }
}
