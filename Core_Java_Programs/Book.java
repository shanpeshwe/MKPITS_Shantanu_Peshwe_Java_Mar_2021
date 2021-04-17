//exmple of copy ing the values of object to another object using constructor
//create a class book having fields booname and author and constructor with 2 parameters
// and anohter constructor to copy values of one object to another object. and display method.
//also b3 is copied without constructor.

public class Book {
    String bookname;
    String author;

    public Book(String bn,String au){
    bookname=bn;
    author=au;
    }

    public Book(Book bo) {
        bookname=bo.bookname;
        author=bo.author;
    }

    public Book() {

    }

    public void display(){
    System.out.println("Book Name : "+bookname);
    System.out.println("Book Author : "+author);
    }
}
class Bookex{
    public static void main(String[] args){
    Book b1=new Book("Oracle","Richards");
    Book b2=new Book(b1);
    b1.display();
    b2.display();

    //copy without constructor
    Book b3=new Book();
    b3.bookname=b1.bookname;
    b3.author=b1.author;
    b3.display();
    }
}