//wap to create array of 3 rows and 3 column and display the sum of all element

#include<stdio.h>
#include<conio.h>

int main()
{
	int mat[3][3];
	int i,j,sum=0;
	
	//input the matrix
	for(i=0;i<3;i++)
	{
		for(j=0;j<3;j++)
		{
			printf("\nEnter any number : ");
			scanf("%d",&mat[i][j]);
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
	printf("\nSum of all numbers in matrix is : %d",sum);
	return 0;
}
