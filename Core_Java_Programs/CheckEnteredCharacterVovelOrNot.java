//Write a program to check whether an alphabet is a vowel or consonant
import java.util.*;

public class CheckEnteredCharacterVovelOrNot {
    public static void main(String[] args)
    {
        char ch;
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter any Character : ");
        ch=sc.next().charAt(0);

        if (ch>='a' && ch<='z' || ch>='A'&&ch<='Z')
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
                System.out.println("Entered character ["+ch+"] is a vovel");
            else
                System.out.println("Entered character ["+ch+"] is not a vovel");
        else
            System.out.println("Please enter correct character");
    }

}
