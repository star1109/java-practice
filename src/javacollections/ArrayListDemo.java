package javacollections;

import java.util.ArrayList;

public class ArrayListDemo
{
//Array
    int a[] = new int[5];

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(40);
        list.add(50);

        for(int i = 0; i < list.size();i++)
        {
            System.out.println(list.get(i));
        }
        list.remove(2);

        for(int data : list)
        {
            System.out.println(data);
        }
    }
}
