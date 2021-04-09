//wap to do transpose of a 3x3 matrix
import java.util.*;

public class TransposeOfAMatrix {
    public static void main(String[] args)
    {
        int[][] mat1=new int[3][3];
        int[][] mat2=new int[3][3];
        int i,j;
        Scanner sc=new Scanner(System.in);

        //input characters for matrix
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                System.out.println("Enter any number : ");
                mat1[i][j]= sc.nextInt();
            }
        }

        //print matrix 1
        System.out.println("Entered number matrix is :");
        System.out.println();

        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                System.out.print("\t"+mat1[i][j]);
            }
            System.out.println();
        }

        //transpose of matrix
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                mat2[j][i]=mat1[i][j];
            }
        }

        //print transpose matrix 2
        System.out.println("Transpose of above matrix : ");
        System.out.println();
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                System.out.print("\t"+mat2[i][j]);
            }
            System.out.println();
        }
    }
}
