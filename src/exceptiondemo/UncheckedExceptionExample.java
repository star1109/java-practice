package exceptiondemo;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class UncheckedExceptionExample
{
    //occurs at run time
    public static void main(String[] args) {
        test();
        test1();
    }
    public static void readFile(String fileName) {

        try {
            FileReader reader = new FileReader(fileName);
        } catch (FileNotFoundException e) {
            System.out.println("file error");
        }
    }
    public static void result()  {

        readFile("test.text");
    }

    public static void test() {
        result();
    }


    public static void test1()
    {
        int a = 10;
        int b = 0;

        try{
            int ans = a/b;
        }catch (Exception e)
        {
            System.out.println("exception occurs");
        }finally{
            //code to be excuted code
        }

    }
}
