//example of calling 3 differnt functions from the main function
import java.util.*;

public class ExampleOfFunctionWithReturnTypeAndWithParamaters3 {
    public static int total(int n1,int n2,int n3)
    {
        int total;
        total=n1+n2+n3;
        return (total);
    }

    public static float percentage(int total)
    {
        float percentage;
        percentage=(float) (total/300.0f)*100;
        return percentage;
    }

    public static void grade(double per)
    {
        if(per>=75)
            System.out.println("Grade = Distinction");
        else if (per<75 && per >=40)
            System.out.println("Grade = First class");
        else
            System.out.println("Grade = Failed");
    }

    public static void main(String[] args)
    {
        int s1,s2,s3,res;
        float per;
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter marks of 3 Subject : ");
        s1=sc.nextInt();
        s2=sc.nextInt();
        s3=sc.nextInt();

        res=total(s1,s2,s3);
        System.out.println("Total Marks = "+res);
        per=(float)percentage(res);
        System.out.println("Percentage = "+per);
        grade(per);
    }
}
