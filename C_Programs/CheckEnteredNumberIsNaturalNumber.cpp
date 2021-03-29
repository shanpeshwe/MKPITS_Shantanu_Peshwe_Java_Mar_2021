//print whether entered number is natural number or not

#include<stdio.h>
#include<conio.h>

int main()
{
	int num;
	printf("Enter any number : ");
	scanf("%d",&num);
	if(num>0)
	{
		printf("\nEntered number is natural number");
	}
	else
	{
		printf("\nEntered number is not a natural number");
	}
	return 0;
}
