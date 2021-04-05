//Write a C program to find the largest of three numbers

#include<stdio.h>
#include<conio.h>

int main()
{
	int num1, num2, num3;
	printf("\nEnter num1 : ");
	scanf("%d",&num1);
	printf("\nEnter num2 : ");
	scanf("%d",&num2);
	printf("\nEnter num3 : ");
	scanf("%d",&num3);
	
	if (num1>num2)
		if(num1>num3)
			printf("\nNum1 %d is the greatest number",num1);
		else
			printf("\nNum3 %d is greatest number",num3);
	else if (num2>num3)
		printf("\nNum2 %d is greatest number",num2);
	else
		printf("\nNum3 %d is greatest number",num3);				
	return 0;
}
