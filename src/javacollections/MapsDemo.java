package javacollections;

import java.util.HashMap;
import java.util.Map;

public class MapsDemo {

    public static void main(String[] args) {
    //declare map
       //  ArrayList<String> list = new ArrayList();
        Map<Integer,String> list = new HashMap<>();
        list.put(1,"BMW");
        list.put(2,"tesla");
        list.put(3,"Audi");
        list.put(4,"Honda");
        list.put(4,"Honda");


        for(Map.Entry <Integer,String> carNme:list.entrySet())
        {
          //  System.out.println(carNme.getKey() + "," + carNme.getValue());
            System.out.println(carNme);
        }
    }



}
