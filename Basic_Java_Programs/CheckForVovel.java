/*wap to create  a character array of 5 elements
accept 5 characters from the user
and then display each character in a new line.
then search in an array whether a vowel character is present in it or not*/

import java.util.*;

public class CheckForVovel {

    public static void main(String[] args) {
        char character[]=new char[5];
        int cnt;
        Scanner sc=new Scanner(System.in);

        for (cnt = 0; cnt < 5; cnt++) {
            System.out.println("\nEnter any character : ");
            character[cnt]=sc.next().charAt(0);
        }

        for (cnt = 0; cnt < 5; cnt++) {
            System.out.println("Entered character "+cnt+" = " + character[cnt]);
        }
        for (cnt = 0; cnt < 5; cnt++) {
            if (character[cnt] == 'a') {
                System.out.println("Character "+character[cnt]+" on "+cnt+" is a vovel");
            } else if (character[cnt] == 'e') {
                System.out.println("Character "+character[cnt]+" on "+cnt+" is a vovel");
            } else if (character[cnt] == 'i') {
                System.out.println("Character "+character[cnt]+" on "+cnt+" is a vovel");
            } else if (character[cnt] == 'o') {
                System.out.println("Character "+character[cnt]+" on "+cnt+" is a vovel");
            } else if (character[cnt] == 'u') {
                System.out.println("Character "+character[cnt]+" on "+cnt+" is a vovel");
            }
        }
    }
}