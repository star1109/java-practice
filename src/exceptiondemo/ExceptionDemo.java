package exceptiondemo;

import java.util.Scanner;

public class ExceptionDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 1st value: ");
        int a = scanner.nextInt();

        System.out.println("Enter 2nd value: ");
        int b = scanner.nextInt();
        try {
            int ans = a / b;
            System.out.println(ans);
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
        finally {
            System.out.println("All good");
        }
        System.out.println("program executed successfully!");


    }
}
