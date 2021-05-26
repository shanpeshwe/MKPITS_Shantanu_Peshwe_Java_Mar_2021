//Let's see an example of List where we are adding the Books.

import java.util.*;
class Book2 {
    int id;
    String name,author,publisher;
    int quantity;
    public Book2(int id, String name, String author, String publisher, int quantity) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.quantity = quantity;
    }
}
public class ListBookEx {
    public static void main(String[] args) {
        //Creating list of Books
        List<Book2> list=new ArrayList<Book2>();
        //Creating Books
        Book2 b1=new Book2(101,"Let us C","Yashwant Kanetkar","BPB",8);
        Book2 b2=new Book2(102,"Data Communications and Networking","Forouzan","Mc Graw Hill",4);
        Book2 b3=new Book2(103,"Operating System","Galvin","Wiley",6);
        //Adding Books to list
        list.add(b1);
        list.add(b2);
        list.add(b3);
        //Traversing list
        for(Book2 b:list){
            System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
        }
    }
}
