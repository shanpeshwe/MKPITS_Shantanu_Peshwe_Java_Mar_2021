//Java LinkedList Example

import java.util.*;
public class LinkedListEx1{
    public static void main(String args[]){

        LinkedList<String> ll=new LinkedList<String>();
        ll.add("Ravi");
        ll.add("Vijay");
        ll.add("Ravi");
        ll.add("Ajay");
        ll.add("Ajay");

        Iterator<String> itr=ll.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
