//Write a program to accept the height of a person in centimeter and
//categorize the person according to their height.

import java.util.*;

public class EnterHeightAndClassify {
    public static void main(String[] args)
    {
        int h;
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the height in cm : ");
        h=sc.nextInt();
        if(h>=175)
            System.out.println("You are Tall");
        else if (h>=145 && h<175)
            System.out.println("You are medium heighted");
        else if (h<145)
            System.out.println("You are small heighted");
    }
}
