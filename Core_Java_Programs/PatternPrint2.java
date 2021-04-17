/*Write a program in C to display the pattern like right angle triangle with a number.
The pattern like :

1
12
123
1234
*/


public class PatternPrint2 {
    public static void main(String[] args)
    {
        int a,b;

        for(a=1;a<=4;a++)
        {
            for(b=1;b<=a;b++)
            {
                System.out.print(b+"\t");
            }
            System.out.println();
        }
    }
}