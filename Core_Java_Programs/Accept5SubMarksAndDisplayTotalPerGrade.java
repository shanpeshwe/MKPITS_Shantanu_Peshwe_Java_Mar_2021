//wap to accept 5 subject marks and display total , per , grade
import java.util.*;

public class Accept5SubMarksAndDisplayTotalPerGrade {
    public static void main(String[] args){
        float m1,m2,m3,m4,m5,total,per;
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Sub1 Marks : ");
        m1=sc.nextFloat();
        System.out.println("Enter Sub2 Marks : ");
        m2=sc.nextFloat();
        System.out.println("Enter Sub3 Marks : ");
        m3=sc.nextFloat();
        System.out.println("Enter Sub4 Marks : ");
        m4=sc.nextFloat();
        System.out.println("Enter Sub5 Marks : ");
        m5=sc.nextFloat();

        total=m1+m2+m3+m4+m5;
        per=(total/500)*100;

        System.out.println("Total = "+total);
        System.out.println("Percentage = "+per);

        if(per>=75){
            System.out.println("Grade : Distinction");
        }
        else if(per<75 && per>=60){
            System.out.println("Grade : First Class");
        }
        else if(per<60 && per>=40){
            System.out.println("Grade : Second Class");
        }
        else{
            System.out.println("You have failed the exam");
        }

    }
}
