//example where we are using ArrayList and LinkedList both.

import java.util.*;
class TestArrayLinked{
    public static void main(String args[]){

        List<String> al=new ArrayList<String>();//creating arraylist
        al.add("Ravi");//adding object in arraylist
        al.add("Vijay");
        al.add("Ravi");
        al.add("Ajay");

        List<String> al2=new LinkedList<String>();//creating linkedlist
        al2.add("Ravi");//adding object in linkedlist
        al2.add("Vijay");
        al2.add("Ravi");
        al2.add("Ajay");

        System.out.println("arraylist: "+al);
        System.out.println();
        System.out.println("linkedlist: "+al2);
    }
}
