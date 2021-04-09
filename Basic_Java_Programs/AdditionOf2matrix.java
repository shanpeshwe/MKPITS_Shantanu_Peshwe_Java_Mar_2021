//wap to do addition of 2 matrix into  3 matrix

public class AdditionOf2matrix {
    public static void main(String[] args)
    {
        int[][] mat1=new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        int[][] mat2=new int[][]{{9,8,7},{6,5,4},{3,2,1}};
        int[][] mat3=new int[3][3];
        int i,j;

        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                mat3[i][j]=mat1[i][j]+mat2[i][j];
            }
        }
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                System.out.print("\t"+mat3[i][j]);
            }
            System.out.println();
        }
    }
}
