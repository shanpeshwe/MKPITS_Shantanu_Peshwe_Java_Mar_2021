//create a 2 d array of 4 rows and 5 column

#include<stdio.h>
#include<conio.h>

int main()
{
	int num[4][5];
	int i,j;
	for(i=0;i<4;i++)
	{
		for(j=0;j<5;j++)
		{
			printf("\nEnter any number : ");
			scanf("%d",&num[i][j]);
		}
	}
	for(i=0;i<4;i++)
	{
		for(j=0;j<5;j++)
		{
			printf("%d\t",num[i][j]);
		}
		printf("\n");
	}
	
	return 0;
}
