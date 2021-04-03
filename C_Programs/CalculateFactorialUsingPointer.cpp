//create a function to calculate factorial of a number using pointer

#include<stdio.h>
#include<conio.h>
#include<string.h>

void calculate(int num,float *f)
{
	*f=1;
	while(num>0)
	{
		*f=*f*num;
		num=num-1;
	}
}

int main()
{
	int num;
	float f;
	printf("Enter any number : ");
	scanf("%d",&num);
	calculate(num,&f);
	printf("\nFactorial of %d : %.2f",num,f);
	return 0;
}
