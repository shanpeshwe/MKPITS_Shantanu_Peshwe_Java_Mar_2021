/*create a function calculate with 3 parameters
calculate ( int n1, int n2 , char ch)
and display the result . (do with without return type and with return type.)
*/
import java.util.*;

public class FunctionToCalculate3ParamatersOfEnteredNumbers {
    public static float calculate (float n1, float n2 , char ch)
    {
        float res;
        if (ch== '+')
        {

            res=n1+n2;
            return res;
        }
        else if (ch=='-')
        {

            res=n1-n2;
            return res;
        }
        else if (ch=='*')
        {
            res=n1*n2;
            return res;
        }
        else if (ch=='/')
        {
            res=(n1/n2);
            return res;
        }
        return 0;
    }

    public static void main(String[] args)
    {
        int n1,n2;
        float res;
        char ch;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 2 numbers : ");
        n1=sc.nextInt();
        n2=sc.nextInt();
        System.out.println("Enter the character + , - , * , / : ");
        ch=sc.next().charAt(0);
        res=calculate(n1,n2,ch);
        System.out.println("The '"+ch+"' of 2 numbers is : "+res);
    }
}
