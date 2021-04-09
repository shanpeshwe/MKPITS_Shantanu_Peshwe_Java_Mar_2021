//a  function displaytable(int num) to display the table of that number.
import java.util.*;

public class PrintTableUsingFunction {
    public static void displaytable(int num)
    {
        int cnt,res;
        for (cnt=1;cnt<=10;cnt++)
        {
            res=cnt*num;
            System.out.println(num+"\tx"+cnt+"\t="+res);
        }

    }

    public static void main(String[] args)
    {
        int num;
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter any number : ");
        num=sc.nextInt();
        displaytable(num);
    }
}
