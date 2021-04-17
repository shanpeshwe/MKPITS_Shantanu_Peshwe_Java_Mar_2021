//example of boolean datatype <true or false>
import java.util.*;

public class ExampleOfBooleanDatatype {
    public static void main(String arg[])
    {
        boolean b = true;
        System.out.println("b ="+b);
        System.out.println("enter  value");
        Scanner s=new Scanner(System.in);
        b=s.nextBoolean();
        System.out.println(" value = " + b);
    }
}