//create a 2d array of 2 rows and 2 column to store 4 no. in rows and column format.

#include<stdio.h>
#include<conio.h>

int main()
{
	int num[2][2];
	int i,j;
	num[0][0]=11;
	num[0][1]=12;
	num[1][0]=13;
	num[1][1]=14;
	for(i=0;i<2;i++)
	{
		for(j=0;j<2;j++)
		{
			printf("%d\t",num[i][j]);
		}
		printf("\n");
	}
	return 0;
}
