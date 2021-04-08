//example of char datatype
import java.util.*;

public class ExampleOfCharDatatype {
    public static void main(String arg[])
    {
        char b = 'p';
        System.out.println("b ="+b);
        System.out.println("enter  value");
        Scanner s=new Scanner(System.in);
        b=s.next().charAt(0);
        System.out.println(" value = " + b);
    }
}
