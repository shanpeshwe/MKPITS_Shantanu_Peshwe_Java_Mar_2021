//example of switch with class
import java.util.*;

public class ExampleOfSwitchWithClass {
    public static  void main(String[] arg)
    {
        Scanner scan=new Scanner(System.in);
        Calculate cal1 = new Calculate();
        System.out.println("enter 2 numbers  ");
        int n1=scan.nextInt();
        int n2=scan.nextInt();
        System.out.println("enter add ,sub ,mul ");
        String op=scan.next();

        switch (op) {
            case "add":
                int result = cal1.addition(n1, n2);
                System.out.println("additon  " + result);
                break;
            case "sub":
                result = cal1.substraction(n1, n2);
                System.out.println("substraction  " + result);
                break;
            case "mul":
                result = cal1.multiplication(n1, n2);
                System.out.println("multiplication  " + result);
                break;
            default:
                System.out.println("invalid entry");
                break;
        }

    }
}
///////// creating a class calculate ///////////
class Calculate
{
    int num1,num2;
    int addition(int n1,int n2)
    {
        num1=n1;
        num2=n2;
        int res=num1+num2;
        return res;
    }
    int substraction(int n1,int n2)
    {
        num1=n1;
        num2=n2;
        int res=num1-num2;
        return res;
    }
    int multiplication(int n1,int n2)
    {
        num1=n1;
        num2=n2;
        int res=num1*num2;
        return res;
    }
}

