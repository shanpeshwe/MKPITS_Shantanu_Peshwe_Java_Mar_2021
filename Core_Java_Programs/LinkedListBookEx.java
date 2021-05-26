//Java LinkedList Example: Book

import java.util.*;

class Book {
    int id;
    String name,author,publisher;
    int quantity;
    public Book(int id, String name, String author, String publisher, int quantity) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.quantity = quantity;
    }
}
public class LinkedListBookEx {
    public static void main(String[] args) {
        //Creating list of Books
        LinkedList<Book> ll=new LinkedList<Book>();
        //Creating Books
        Book b1=new Book(101,"Let us C","Yashwant Kanetkar","BPB",8);
        Book b2=new Book(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);
        Book b3=new Book(103,"Operating System","Galvin","Wiley",6);
        //Adding Books to list
        ll.add(b1);
        ll.add(b2);
        ll.add(b3);
        //Traversing list
        for(Book b:ll){
            System.out.println(b.id+", "+b.name+", "+b.author+", "+b.publisher+", "+b.quantity);
        }
    }
}
