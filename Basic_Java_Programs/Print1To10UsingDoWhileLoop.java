//print 1 to 10 using while loop
import java.util.*;

public class Print1To10UsingDoWhileLoop {
    public static void main(String[] args) {
        int num = 1;
        do {
            System.out.print(num + "\t");
            num++;
        }while(num<=10);
    }
}