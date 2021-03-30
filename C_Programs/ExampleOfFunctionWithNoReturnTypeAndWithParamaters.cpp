//- function not returning any value and with parameters.
//create a function calculate with 2 integer parameters and calculate and display the addition of 2 no.

#include<stdio.h>
#include<conio.h>

void sum(int num1,int num2)
{
	int sum;
	sum=num1+num2;
	printf("\nSum of 2 numbers = %d",sum);
}

int main()
{
	int n1,n2;
	printf("Enter 2 numbers : ");
	scanf("%d%d",&n1,&n2);
	sum(n1,n2);
	printf("\nReturn to Main");
	return 0;
}
