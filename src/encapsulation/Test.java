package encapsulation;

public class Test
{
    public static void main(String[] args) {
        EncapsulationDemo obj = new EncapsulationDemo();
        obj.setId(10);
        obj.setName("prime");

        System.out.println(obj.getId());
        System.out.println(obj.getName());

    }
}
