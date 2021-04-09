/*create function
	a- calculatetotal(int sub1,int sub2,int sub3)
	b - calculatepercentage(int total)
	c- calculategrade(float per)
	*/
import java.util.*;

public class ExampleOfFunctionWithNoReturnAndWithParamaters {
    public static void calculatetotal(int s1,int s2,int s3)
    {
        int total;
        total=s1+s2+s3;
        System.out.println("Total Marks = "+total+" / 300");
        calculatepercentage(total);
    }

    public static void calculatepercentage(int total)
    {
        double per;
        per=(double)(total/300.0f)*100;
        System.out.println("Percentage = "+per+" %");
        calculategrade(per);
    }

    public static void calculategrade(double per)
    {
        if (per>=75)
            System.out.println("Grade : Distinction");
        else if(per<75 && per>=40)
            System.out.println("Grade : First Division");
        else
            System.out.println("Failed");
    }

    public static void main(String[] args)
    {
        int s1,s2,s3;
        Scanner sc=new Scanner(System.in);

        System.out.println("enter marks of 3 subjects : ");
        s1=sc.nextInt();
        s2=sc.nextInt();
        s3=sc.nextInt();
        calculatetotal(s1,s2,s3);
    }

}
