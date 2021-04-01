//wap to do multiplication of 2 matrix into  3 matrix

#include<stdio.h>
#include<conio.h>

int main()
{
	int mat1[3][3]={{1,2,3},{4,5,6},{7,8,9}};
	int mat2[3][3]={{9,8,7},{6,5,4},{3,2,1}};
	int mat3[3][3];
	int i,j;
	for(i=0;i<3;i++)
	{
		for(j=0;j<3;j++)
		{
			mat3[i][j]=mat1[i][j]*mat2[i][j];
		}
	}
	for(i=0;i<3;i++)
	{
		for(j=0;j<3;j++)
		{
			printf("%d\t",mat3[i][j]);
		}
		printf("\n");
	}
	return 0;
}
