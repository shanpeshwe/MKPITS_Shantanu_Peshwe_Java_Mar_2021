//wap to use arraycopy method to copy some characters from one array to another array.
import java.util.*;

public class ExampleOfArrayCopy {
    public static void main(String[] args){
        char cf[]={ 'd', 'e', 'c', 'a', 'f', 'f', 'e', 'i', 'n', 'a', 't', 'e', 'd' };
        char ct[]=new char[7];

        System.arraycopy(cf,2,ct,0,7);

        System.out.println(new String(ct));
    }
}
