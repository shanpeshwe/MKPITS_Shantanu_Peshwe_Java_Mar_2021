/*Write a program to accept a grade and declare the equivalent description :
Grade 	Description
E 	Excellent
V 	Very Good
G 	Good
A 	Average
F 	Fail*/
import java.util.*;

public class PrintGradeDescription {
    public static void main(String[] args)
    {
        char ch;
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Grade from E, V, G, A, F : ");
        ch=sc.next().charAt(0);

        if(ch=='E')
            System.out.println("Grade "+ch+" : Excellent");
        if(ch=='V')
            System.out.println("Grade "+ch+" : Very Good");
        if(ch=='G')
            System.out.println("Grade "+ch+" : Good");
        if(ch=='A')
            System.out.println("Grade "+ch+" : Average");
        if(ch=='F')
            System.out.println("Grade "+ch+" : Fail");
    }
}