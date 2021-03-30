//function returning a value and with parameters
//create a function calcualte with 2 int parameters and return the sum of 2 no.

#include<stdio.h>
#include<conio.h>

int sum()
{
	int num1,num2,sum;
	printf("Enter 2 numbers : ");
	scanf("%d%d",&num1,&num2);
	sum=num1+num2;
	return sum;
}

int main()
{
	int res;
	printf("\nSum of 2 numbers = %d",res=sum());
	return 0;
}
