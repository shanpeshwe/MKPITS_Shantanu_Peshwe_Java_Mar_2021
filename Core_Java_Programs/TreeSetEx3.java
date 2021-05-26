//example to retrieve and remove the highest and lowest Value.

import java.util.*;
class TreeSetEx3{
    public static void main(String args[]){
        TreeSet<Integer> set=new TreeSet<Integer>();
        set.add(24);
        set.add(66);
        set.add(12);
        set.add(15);
        System.out.println("Highest Value: "+set.pollFirst());
        System.out.println("Lowest Value: "+set.pollLast());
        Iterator<Integer> i=set.iterator();
        while(i.hasNext()) {
            System.out.println(i.next());
        }
    }
}
