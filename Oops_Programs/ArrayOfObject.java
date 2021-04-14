//array of object example

public class ArrayOfObject {
    public static void main(String[] args) {
        Book b[]=new Book[3];
        b[0]=new Book("oracle","abc");
        b[1]=new Book("visual basic","bbc");
        b[2]=new Book("java","ccc");
        System.out.println("book 1 details : ");
        b[0].display();
        System.out.println("book 2 details : ");
        b[1].display();
        System.out.println("book 3 details : ");
        b[2].display();
    }

}
