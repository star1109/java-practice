package constructors;

public class ConstructorExample
{
    int empID;
    String name ;

    public ConstructorExample(int empID,String name)
    {
       this.empID = empID;
       this.name = name;

    }

    public static void main(String[] args) {
        ConstructorExample obj = new ConstructorExample(10,"Riya");
        obj.myMethod();

        ConstructorExample obj1 = new ConstructorExample(20,"talati");
        obj1.myMethod();

    }

public void myMethod()
{
    System.out.println(empID);
    System.out.println(name);
}

}
