//wap to create a 2 d array(matrix ) of 3 rows and 2 column

#include<stdio.h>
#include<conio.h>

int main()
{
	int num[3][2];
	int i,j;
	for(i=0;i<3;i++)
	{
		for(j=0;j<2;j++)
		{
			printf("\nEnter any number : ");
			scanf("%d",&num[i][j]);
		}
	}
	for(i=0;i<3;i++)
	{
		for(j=0;j<2;j++)
		{
			printf("%d\t",num[i][j]);
		}
		printf("\n");
	}
	return 0;
}
