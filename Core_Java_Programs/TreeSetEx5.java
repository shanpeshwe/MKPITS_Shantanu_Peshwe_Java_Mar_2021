//In this example, we perform various SortedSetSet operations.

import java.util.*;
class TreeSetEx5{
    public static void main(String args[]){
        TreeSet<String> set=new TreeSet<String>();
        set.add("A");
        set.add("B");
        set.add("C");
        set.add("D");
        set.add("E");

        System.out.println("Intial Set: "+set);
        System.out.println();
        System.out.println("Head Set: "+set.headSet("C"));
        System.out.println();
        System.out.println("SubSet: "+set.subSet("A", "E"));
        System.out.println();
        System.out.println("TailSet: "+set.tailSet("C"));
    }
}
