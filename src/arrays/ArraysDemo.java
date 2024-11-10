package arrays;

public class ArraysDemo
{
    public static void main(String[] args)
    {
        int x [] = {1,2,3,9};// approach 1
        int a[] = new int[5] ; // approach 2
        a[0]=10;
        a[1]=20;
        a[2]=30;
        a[3]=40;
        a[4]=50;

//        System.out.println(a[3]);//40
      // System.out.println(x[2]);//3
//        System.out.println(a[0]);//10

        for(int i =0; i<a.length; i++)
        {
            System.out.println(a[i]);

        }




    }
}
