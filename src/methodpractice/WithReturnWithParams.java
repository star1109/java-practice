package methodpractice;

public class WithReturnWithParams
{
    int  x = 10;
    public static void main(String[] args)
    {

        int x =20;
        int y = 20;
        WithReturnWithParams obj = new WithReturnWithParams();

        System.out.println(obj.addition(5,6));// calling meyhod directlt in console with object name
        System.out.println(obj.addition(x,y));
    }

    public int addition(int a,int b)
    {

        int result  =a+b;
        return result;

    }

}
