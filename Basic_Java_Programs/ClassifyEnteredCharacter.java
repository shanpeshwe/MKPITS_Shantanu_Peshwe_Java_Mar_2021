//Write a C program to check whether a character is an alphabet,
//digit or special character
import java.util.*;

public class ClassifyEnteredCharacter {
    public static void main(String[] args)
    {
        char ch;
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter any Character : ");
        ch=sc.next().charAt(0);

        if (ch>='a' && ch<='z' || ch>='A' && ch<='Z')
            System.out.println("Entered character ["+ch+"] is a alphabate");
        else if (ch>='0' && ch<='9')
            System.out.println("Entered character ["+ch+"] is a digit");
        else
            System.out.println("Entered character ["+ch+"] is a special character");
    }
}
