//entry for 3 book object array from useer and display the same
import java.util.*;

public class ArrayOfObjectBookUsingEntry {
    public static void main(String[] args){
        Book b[]=new Book[3];
        Scanner sc=new Scanner(System.in);
        int i;
        String bn;
        String au;

        for (i=0;i<3;i++){
            System.out.println("Enter book name and author : ");
            bn=sc.next();
            au=sc.next();
            b[i]=new Book(bn,au);
        }

        //display
        for (i=0;i<3;i++){
        b[i].display();
        }
    }
}
