//Entered number is prime or not using for loop

#include<stdio.h>
#include<conio.h>

int main()
{
	int cnt,rem,num;
	printf("Enter any number : ");
	scanf("%d",&num);
	for (cnt=2;rem<cnt;++cnt)
	{
		rem=num%cnt;
		if(rem==0)
		{
			break;
		}
	}
	if (cnt==num)
	{
		printf("\nEntered number is prime number");
	}
	else
	{
		printf("\nEntered number is not a prime number");
	}
	
	return 0;
}
