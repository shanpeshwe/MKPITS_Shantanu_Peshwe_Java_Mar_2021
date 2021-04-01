//wap to do transpose of a 3x3 matrix

#include<stdio.h>
#include<conio.h>

int main()
{
	int mat1[3][3];
	int mat2[3][3];
	int i,j;
	
	//input characters for matrix
	for(i=0;i<3;i++)
	{
		for(j=0;j<3;j++)
		{
			printf("\nEnter any number : ");
			scanf("%d",&mat1[i][j]);
		}
	}
	
	//print matrix 1
	printf("\nEntered number matrix is : \n");
	for(i=0;i<3;i++)
	{
		for(j=0;j<3;j++)
		{
			printf("%d\t",mat1[i][j]);
		}
		printf("\n");
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
	printf("\nTranspose of above matrix : \n");
	for(i=0;i<3;i++)
	{
		for(j=0;j<3;j++)
		{
			printf("%d\t",mat2[i][j]);
		}
		printf("\n");
	}
	return 0;
}
