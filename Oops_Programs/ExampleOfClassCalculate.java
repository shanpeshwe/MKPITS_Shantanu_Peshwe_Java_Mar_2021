//create a class calculate having member variable num1 and num2
//and methods addition, substraction and mutliplication
import java.util.*;

public class ExampleOfClassCalculate {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Calculate call=new Calculate();
        System.out.println("Enter 2 numbers : ");
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int res=call.addition(n1,n2);
        System.out.println("Addition is : "+res);
        res=call.substraction(n1,n2);
        System.out.println("Substraction is : "+res);
        res=call.multiplication(n1,n2);
        System.out.println("Multiplication is : "+res);
    }
    static class Calculate{
    int num1,num2;
    int res;

    int addition(int n1,int n2){
        num1=n1;
        num2=n2;
        res=num1+num2;
        return res;
    }
    int substraction(int n1,int n2){
        num1=n1;
        num2=n2;
        res=num1-num2;
        return res;
    }
    int multiplication(int n1,int n2){
        num1=n1;
        num2=n2;
        res=num1*num2;
        return res;
    }
    }
}
