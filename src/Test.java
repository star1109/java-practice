import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args){

        List<String> list = new ArrayList<>();
        list.add("Ajit");
        list.add("Nirali");
        list.add("Riya");

        for(String str : list)
        {
            System.out.println(str);
        }
    }


}
