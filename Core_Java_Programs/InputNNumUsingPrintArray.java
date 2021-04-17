//wap to create a 2 d array(matrix ) of 3 rows and 2 column
import java.util.*;

public class InputNNumUsingPrintArray {
    public static void main(String[] args)
    {
        int[][] num=new int[3][2];
        int i,j;
        Scanner sc=new Scanner(System.in);

        for(i=0;i<3;i++)
        {
            for(j=0;j<2;j++)
            {
                System.out.println("Enter any number : ");
                num[i][j]=sc.nextInt();
            }
        }
        for(i=0;i<3;i++)
        {
            for(j=0;j<2;j++)
            {
                System.out.print(num[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
