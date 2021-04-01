//create a 2 d array of 3 rows and 3 column to store decimal no.

#include<stdio.h>
#include<conio.h>

int main()
{
	float num[3][3];
	int i,j;
	for(i=0;i<3;i++)
	{
		for(j=0;j<3;j++)
		{
			printf("\nEnter any decimal number : ");
			scanf("%f",&num[i][j]);
		}
	}
	for(i=0;i<3;i++)
	{
		for(j=0;j<3;j++)
		{
			printf("%.2f\t",num[i][j]);
		}
		printf("\n");
	}
	return 0;
}
