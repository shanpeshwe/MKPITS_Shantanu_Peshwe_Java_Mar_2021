//constructor chaning example using this keyword

public class ExampleOfConstructorChangingUsingThis {
    static class Book
    {
        String bookname,author;
        int price;
        public  Book(String bookname,String author)
        {
            this.bookname=bookname;
            this.author=author;
        }
        //creating a parameterised constructor
        public Book(String bookname,String author,int price)
        {
            this(bookname,author);
            this.price=price;
        }
        public void displaybookinfo()
        {
            System.out.println(bookname + author + price);
        }
    }

    public static class Test{
        public static void main(String[] args) {
            Book bb=new Book("oracle","richards");
            bb.displaybookinfo();
            Book bb1=new Book("oracle","richards",1200);
            bb1.displaybookinfo();
        }
    }

}
