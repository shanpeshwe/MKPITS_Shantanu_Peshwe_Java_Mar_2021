//create a 2d array of 2 rows and 2 column to store 4 no. in rows and column format.

public class Print2x2Matrix {
    public static void main(String[] args)
    {
        int[][] num=new int[2][2];
        int i,j;
        num[0][0]=11;
        num[0][1]=12;
        num[1][0]=13;
        num[1][1]=14;
        for(i=0;i<2;i++)
        {
            for(j=0;j<2;j++)
            {
                System.out.print("\t"+num[i][j]);
            }
            System.out.println();
        }
    }
}
