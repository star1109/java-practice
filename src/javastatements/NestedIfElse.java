package javastatements;

public class NestedIfElse
{
    public static void main(String[] args) {
        int marks = 70;

        if(marks >= 80)
        {
            System.out.println("Grade A");
        }
        else if(marks  < 80 && marks >=70)
        {
            System.out.println("Grade B");
        }
        else if(marks <70 && marks >=50)
        {
            System.out.println("Grade c");
        }
        else
            System.out.println("Fail");
    }

}
