//Write a C program to accept the height of a person in centimeter and 
//categorize the person according to their height.

#include<stdio.h>
#include<conio.h>

int main()
{
	int h;
	printf("\nEnter the height in cm : ");
	scanf("%d",&h);
	if(h>=175)
		printf("\nYou are Tall");
	else if (h>=145 && h<175)
		printf("\nYou are medium heighted");
	else if (h<145)
		printf("\nYou are small heighted");		
	return 0;
}
