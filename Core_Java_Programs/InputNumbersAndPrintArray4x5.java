//create a 2 d array of 4 rows and 5 column
import java.util.*;

public class InputNumbersAndPrintArray4x5 {
    public static void main(String[] args)
    {
        int[][] num=new int[4][5];
        int i,j;
        Scanner sc=new Scanner(System.in);

        for(i=0;i<4;i++)
        {
            for(j=0;j<5;j++)
            {
                System.out.println("Enter any number : ");
                num[i][j]=sc.nextInt();
            }
        }
        for(i=0;i<4;i++)
        {
            for(j=0;j<5;j++)
            {
                System.out.print(num[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
