//create a 2 d array to store 5 students name
import java.util.*;

public class StoreNameInArray {
    public static void main(String[] args)
    {
        String[] name=new String[5];
        int i;
        Scanner sc=new Scanner(System.in);

        for(i=0;i<5;i++)
        {
            System.out.println("Enter name "+i+" : ");
            name[i]=sc.next();
        }
        for(i=0;i<5;i++)
        {
            System.out.println(name[i]);
        }
    }
}
