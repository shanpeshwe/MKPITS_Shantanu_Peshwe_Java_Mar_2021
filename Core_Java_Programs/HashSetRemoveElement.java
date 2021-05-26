//Java HashSet example to remove elements

import java.util.*;

class HashSet3{
    public static void main(String args[]){
        HashSet<String> set=new HashSet<String>();
        set.add("Ravi");
        set.add("Vijay");
        set.add("Arun");
        set.add("Sumit");
        System.out.println("An initial list of elements: "+set);
        //Removing specific element from HashSet
        set.remove("Ravi");
        System.out.println();
        System.out.println("After invoking remove(Ravi) method: "+set);

        HashSet<String> set1=new HashSet<String>();
        set1.add("Ajay");
        set1.add("Gaurav");
        System.out.println();
        System.out.println("Set1 : "+set1);
        set.addAll(set1);
        System.out.println();
        System.out.println("Adding Set1 to Set: "+set);
        //Removing all the new elements from HashSet
        set.removeAll(set1);
        System.out.println();
        System.out.println("After invoking removeAll(Set1) method: "+set);
        //Removing elements on the basis of specified condition
        set.removeIf(str->str.contains("Vijay"));
        System.out.println();
        System.out.println("After invoking removeIf(Vijay) method: "+set);
        //Removing all the elements available in the set
        set.clear();
        System.out.println();
        System.out.println("After invoking clear() method: "+set);
    }
}
