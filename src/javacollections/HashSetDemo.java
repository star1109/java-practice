package javacollections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo {
    public static void main(String[] args) {
        // declaring hasSet
        Set<String> set = new HashSet();
        set.add("Prime");
        set.add("Prime");
        set.add("Testing");
        set.add("Java");
        set.add("selenium");
        // iterate set using iterator interface
        Iterator itr = set.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
    }
}
