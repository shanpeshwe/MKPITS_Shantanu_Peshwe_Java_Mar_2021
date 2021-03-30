//function returning a value and with parameters
//create a function calcualte with 2 int parameters and return the sum of 2 no.

#include<stdio.h>
#include<conio.h>

int sum(int n1,int n2)
{
	int sum;
	sum=n1+n2;
	return sum;
}

int main()
{
	int num1,num2,res;
	printf("Enter 2 numbers : ");
	scanf("%d%d",&num1,&num2);
	res=sum(num1,num2);
	printf("\nSum of 2 numbers = %d",res);
	return 0;
}
