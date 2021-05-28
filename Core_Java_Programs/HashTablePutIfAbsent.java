//Hashtable Example: putIfAbsent()

import java.util.*;
public class HashTablePutIfAbsent {
    public static void main(String args[]){
        Hashtable<Integer,String> map=new Hashtable<Integer,String>();
        map.put(100,"Amit");
        map.put(102,"Ravi");
        map.put(101,"Vijay");
        map.put(103,"Rahul");
        System.out.println("Initial Map: "+map);
        //Inserts, as the specified pair is unique
        map.putIfAbsent(104,"Gaurav");
        System.out.println("Updated Map: "+map);
        //Returns the current value, as the specified pair already exist
        map.putIfAbsent(101,"Ajay");//this will not be added as 101 is already present
        System.out.println("Updated Map: "+map);
    }
}
