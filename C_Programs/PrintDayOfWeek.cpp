//Write a program in C to read any day number in integer and 
//display day name in the word

#include<stdio.h>
#include<conio.h>

int main()
{
	int n;
	printf("\nEnter day number from 1 to 7 : ");
	scanf("%d",&n);
	
	if (n ==1)
	{
		printf("\nMonday");
	}
	else if(n==2)
		printf("\nTuesday");
	else if(n==3)
		printf("\nWednesday");
	else if(n==4)
		printf("\nThursday");
	else if(n==5)
		printf("\nFriday");
	else if(n==6)
		printf("\nSaturday");
	else if(n==7)
		printf("\nSunday");
	else
		printf("\nEnter a valid number");	
		
	return 0;
}
