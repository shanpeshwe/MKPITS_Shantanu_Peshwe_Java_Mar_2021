//wap to accept a number and print the armstrong no.

#include<stdio.h>
#include<conio.h>

int main()
{
	int num,num1,rem,res=0;
	printf("Enter any number : ");
	scanf("%d",&num);
	num1=num;
	while(num1!=0)
	{
		rem=num1%10;
		res=res+(rem*rem*rem);
		num1/=10;
	}
	
	if (res==num)
	{
		printf("\n%d is an Armstrong number",num);
	}
	else
	{
		printf("\n%d is not an Armstrong number",num);
	}
	return 0;
}
