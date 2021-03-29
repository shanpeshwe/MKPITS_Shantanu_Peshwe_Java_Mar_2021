//Accept a number and print factorial of that number using for loop

#include<stdio.h>
#include<conio.h>

int main()
{
	int num,cnt,fact;
	printf("Enter the number : ");
	scanf("%d",&num);
	for(cnt=num;cnt>0;cnt--)
	{
		fact=fact*cnt;
	}
	printf("\nFactorial of the number %d : %d",num,fact);
	return 0;
}
