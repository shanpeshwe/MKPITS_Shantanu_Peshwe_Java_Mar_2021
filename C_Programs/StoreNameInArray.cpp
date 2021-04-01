//create a 2 d array to store 5 students name

#include<stdio.h>
#include<conio.h>

int main()
{
	char name[5][20];
	int i;
	for(i=0;i<5;i++)
	{	
		printf("\nEnter name %d : ",i);
		scanf("%s",&name[i]);	
	}
	for(i=0;i<5;i++)
	{
		printf("\n%s",name[i]);
	}
	return 0;
}
