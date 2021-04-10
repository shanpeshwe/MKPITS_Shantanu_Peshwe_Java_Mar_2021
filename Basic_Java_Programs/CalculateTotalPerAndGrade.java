/*program to read roll no, name and marks of three subjects and
calculate the total, percentage and division*/
import java.util.*;

public class CalculateTotalPerAndGrade {
    public static void main(String[] args)
    {
        int rno,m1,m2,m3,t;
        float per;
        String name;
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the name of student : ");
        name=sc.next();
        System.out.println("Enter roll number : ");
        rno=sc.nextInt();
        System.out.println("Enter 1st subject marks : ");
        m1=sc.nextInt();
        System.out.println("Enter 2nd subject marks : ");
        m2=sc.nextInt();
        System.out.println("Enter 3rd subject marks : ");
        m3= sc.nextInt();

        t=m1+m2+m3;
        per=(float)(t/300.0f)*100;

        System.out.println("Total Marks = "+t+" / 300");
        System.out.println("Percentage = "+per+"%");

        if(per>=75)
            System.out.println("Grade : Distinction");
        else if(per>=60 && per<75)
            System.out.println("Grade : First class");
        else if(per>=40 && per<60)
            System.out.println("Grade : Second class");
        else
            System.out.println("You have failed the exam");
    }
}
