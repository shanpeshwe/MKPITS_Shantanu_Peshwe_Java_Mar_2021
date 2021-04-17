//Write a C program to calculate profit and loss on a transaction.
import java.util.*;

public class CalculateProfitAndLoss {
    public static void main(String[] args)
    {
        float pp,sp,p,l;
        float pper,lper;
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter purchase price : ");
        pp= sc.nextFloat();
        System.out.println("Enter selling price : ");
        sp=sc.nextFloat();

        if (pp<=sp)
        {
            p=sp-pp;
            pper=(float)(p/pp)*100;
            System.out.println("Profit = "+p+" Rs.");
            System.out.println("Percent profit = "+pper+" percent");
        }
        if(sp<pp)
        {
            l=pp-sp;
            lper=(float)(l/pp)*100.0f;
            System.out.println("Loss = "+l+" Rs.");
            System.out.println("Percent profit = "+lper+" percent");
        }
    }
}
