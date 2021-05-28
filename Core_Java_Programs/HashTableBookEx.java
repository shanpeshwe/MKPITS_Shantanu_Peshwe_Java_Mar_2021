//Hashtable Example: Book

import java.util.*;
class Book3 {
    int id;
    String name,author,publisher;
    int quantity;
    public Book3(int id, String name, String author, String publisher, int quantity) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.quantity = quantity;
    }
}
public class HashTableBookEx {
    public static void main(String[] args) {
        //Creating map of Books
        Map<Integer,Book3> map=new Hashtable<Integer,Book3>();
        //Creating Books
        Book3 b1=new Book3(101,"Let us C","Yashwant Kanetkar","BPB",8);
        Book3 b2=new Book3(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);
        Book3 b3=new Book3(103,"Operating System","Galvin","Wiley",6);
        //Adding Books to map
        map.put(1,b1);
        map.put(2,b2);
        map.put(3,b3);
        //Traversing map
        for(Map.Entry<Integer, Book3> entry:map.entrySet()){
            int key=entry.getKey();
            Book3 b=entry.getValue();
            System.out.println(key+" Details:");
            System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
        }
    }
}
