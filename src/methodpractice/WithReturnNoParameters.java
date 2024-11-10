package methodpractice;

public class WithReturnNoParameters {
    public static void main(String[] args) {
        int num = Test(); // to store the method in the variable
        System.out.println(num); // to print the num variable into the console
        // System.out.println(Test());  to print the method directly
        System.out.println(result());
    }

    public static int Test() {
        int a = 10;
        int b = 20;
        int result = a + b;
        int sub = b - a;
        //System.out.println(result);
        //return sub
        return sub;


    }

    public static boolean result()
    {

        boolean flag = true;
        boolean x = false;
        return flag;

    }

}
