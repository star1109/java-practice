package methodpractice;

public class NoReturnTypewithParameters {
    public static void main(String[] args)
    {
        NoReturnTypewithParameters obj = new NoReturnTypewithParameters();
        obj.addition(10,20,30);
        addition1(20,20);
    }

    public void addition(int a, int b, int c) {

        System.out.println(a+b+c);
    }

    public static void addition1(int a, int b)
    {
        System.out.println(a+b);
    }

}
