package variables;

public class StaticVariables
{
   static   int a = 10;// static variable
    static String name = "prime";
    public static void main(String[] args)
    {
        System.out.println(a);
        System.out.println(name);
        StaticVariables st = new StaticVariables();
        st.test();

    }

    public void test()
    {
        System.out.println(a);
    }
}
