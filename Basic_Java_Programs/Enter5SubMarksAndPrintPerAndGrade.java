//wap to accept rollno, studentname, marks of 5 subject(in an array)
//then display total,per,grade.

import java.util.*;

public class Enter5SubMarksAndPrintPerAndGrade {
    public static void main(String[] args) {
        String name;
        int rollno,marks[]=new int[5];
        int total=0,cnt;
        float per;
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Student Name : ");
        name=sc.next();
        System.out.println("Enter the roll Number : ");
        rollno=sc.nextInt();
        for(cnt=0;cnt<5;cnt++) {
            System.out.println("Enter the "+cnt+" Marks : ");
            marks[cnt]=sc.nextInt();
            total=total+marks[cnt];
        }

        System.out.println("Student Name is "+name);
        System.out.println("Roll Number is "+rollno);
        System.out.println("Total = "+total+" / 500");
        per=(float)(total/500.0f)*100.0f;
        System.out.println("Percentage = "+per+" %");

        if (per>+75) {
            System.out.println("Grade : Distinction");
        }
        else if(per<75 && per>=60) {
            System.out.println("Grade : First Class");
        }
        else if (per<60 && per>=35) {
            System.out.println("Grade : second Class");
        }
        else {
            System.out.println("You have failed");
        }
    }
}
