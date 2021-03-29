//Check entered number is prime or not using do while loop

#include<stdio.h>
#include<conio.h>

int main()
{
	int num,cnt=2,rem;
	printf("\nEnter any number : ");
	scanf("%d",&num);
	do
	{
		rem=num%cnt;
		if(rem==0)
		{
			break;
		}
		cnt++;
	}while(rem<cnt);
	if(cnt == num)
	{
		printf(" \n Number is prime no.");
	}
	else
	{
		printf("\n Number is not a prime no.");
	}

	return 0;
}
