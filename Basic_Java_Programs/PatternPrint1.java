/*Write a program in C to display the pattern like right angle triangle using an asterisk.
	The pattern like :

*
**
***
****

*/


public class PatternPrint1 {
    public static void main(String[] args)
    {
        int a,b;

        for(a=1;a<=4;a++)
        {
            for(b=1;b<=a;b++)
            {
                System.out.print("*\t");
            }
            System.out.println();
        }
    }
}