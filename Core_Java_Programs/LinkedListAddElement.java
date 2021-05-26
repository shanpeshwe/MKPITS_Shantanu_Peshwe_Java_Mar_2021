//Java LinkedList example to add elements

import java.util.*;

public class LinkedListAddElement {
    public static void main(String args[]){
        LinkedList<String> ll=new LinkedList<String>();
        System.out.println("Initial list of elements: "+ll);
        ll.add("Ravi");
        ll.add("Vijay");
        ll.add("Ajay");
        System.out.println("After invoking add(E e) method: "+ll);

        //Adding an element at the specific position
        ll.add(1, "Gaurav");
        System.out.println();
        System.out.println("After invoking add(int index, E element) method: "+ll);

        LinkedList<String> ll2=new LinkedList<String>();
        ll2.add("Sonoo");
        ll2.add("Hanumat");
        System.out.println();
        System.out.println("List2 elements: "+ll2);
        //Adding second list elements to the first list
        ll.addAll(ll2);
        System.out.println();
        System.out.println("After adding list2 elements to list1 : "+ll);

        LinkedList<String> ll3=new LinkedList<String>();
        ll3.add("John");
        ll3.add("Rahul");
        System.out.println();
        System.out.println("List3 elements: "+ll3);
        //Adding second list elements to the first list at specific position
        ll.addAll(1, ll3);
        System.out.println();
        System.out.println("After adding list3 elements to list1 at position 1 : "+ll);
        //Adding an element at the first position
        ll.addFirst("Lokesh");
        System.out.println();
        System.out.println("After invoking addFirst method: "+ll);

        //Adding an element at the last position
        ll.addLast("Harsh");
        System.out.println();
        System.out.println("After invoking addLast method: "+ll);

    }
}
