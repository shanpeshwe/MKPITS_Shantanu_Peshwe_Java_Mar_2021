//create a class book having fields bookid,bookname,author,price and methods getbookdata and display bookdata
import java.util.*;

public class ExampleOfBookClass {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Book b1=new Book();
        System.out.println("enter book id, name, author and price :");
        int b=sc.nextInt();
        String bn=sc.next();
        String au=sc.next();
        int p=sc.nextInt();
        b1.getdata(b,bn,au,p);
        b1.displaydata();
    }
    static class Book{
        int bookid;
        String bookname;
        String author;
        int price;
        void getdata(int b,String bn,String au,int p){
            bookid=b;
            bookname=bn;
            author=au;
            price=p;
        }
        void displaydata(){
        System.out.println("Book ID : "+bookid);
        System.out.println("Book Name : "+bookname);
        System.out.println("Book Author : "+author);
        System.out.println("Book Price : "+price);
        }
    }
}
