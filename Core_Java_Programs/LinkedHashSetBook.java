//Java LinkedHashSet Example: Book

import java.util.*;
class Book4 {
    int id;
    String name,author,publisher;
    int quantity;
    public Book4(int id, String name, String author, String publisher, int quantity) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.quantity = quantity;
    }
}
public class LinkedHashSetBook {
    public static void main(String[] args) {
        LinkedHashSet<Book4> hs=new LinkedHashSet<Book4>();
        //Creating Books
        Book4 b1=new Book4(101,"Let us C","Yashwant Kanetkar","BPB",8);
        Book4 b2=new Book4(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);
        Book4 b3=new Book4(103,"Operating System","Galvin","Wiley",6);
        //Adding Books to hash table
        hs.add(b1);
        hs.add(b2);
        hs.add(b3);
        //Traversing hash table
        for(Book4 b:hs){
            System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
        }
    }
}
