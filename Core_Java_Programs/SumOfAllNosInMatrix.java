//wap to create array of 3 rows and 3 column and display the sum of all element
import java.util.*;

public class SumOfAllNosInMatrix {
    public static void main(String[] args)
    {
        int[][] mat=new int[3][3];
        int i,j,sum=0;
        Scanner sc=new Scanner(System.in);

        //input the matrix
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                System.out.println("Enter any number : ");
                mat[i][j]=sc.nextInt();
            }
        }

        //sum of all numbers in matrix
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                sum=sum+mat[i][j];
            }
        }

        //print sum
        System.out.println("Sum of all numbers in matrix is : "+sum);
    }
}
