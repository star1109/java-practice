package javacollections;

public class Test {
    public static void main(String[] args) {

        int a =10;
        Integer wrapper = new Integer(a);
        System.out.println(a);

        int unwrapped = wrapper.intValue();
        System.out.println(unwrapped);
    }
}
