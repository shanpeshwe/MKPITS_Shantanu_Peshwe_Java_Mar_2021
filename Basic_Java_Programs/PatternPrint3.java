/*Write a program in C to make such a pattern like right angle triangle with a number which will repeat a number in a row.
The pattern like :

 1
 22
 333
 4444
 */


public class PatternPrint3 {
    public static void main(String[] args)
    {
        int a,b;

        for(a=1;a<=4;a++)
        {
            for(b=1;b<=a;b++)
            {
                System.out.print(a+"\t");
            }
            System.out.println();
        }
    }
}