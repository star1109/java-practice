package stringmethods;

public class StringMethods
{
    public static void main(String[] args)
    {
        String s1 = "this is a first method";
        String s2 = "this is a second method";
        int l = s1.length();
        System.out.println("length of the s1 string is " +l+ ".");
        //System.out.println(s1.length());
        System.out.println(s1.contains("iss"));//false
        System.out.println(s1.contains("is"));//true
        System.out.println(s1.toUpperCase()); //THIS IS A FIRST METHOD
        System.out.println(s1.trim());
        System.out.println(s1.equalsIgnoreCase(s2));
        System.out.println(s1.isEmpty());
        System.out.println(s1.replace("this","welcome"));
    }


}
