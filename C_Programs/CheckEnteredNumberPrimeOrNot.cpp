//accept a number and print whether it is prime or not.

#include<stdio.h>
#include<conio.h>

int main()
{
	int num,cnt=2,rem;
	printf("Enter any Number : ");
	scanf("%d",&num);
	while(cnt<num)
	{
		rem=num%cnt;7
		if(rem==0)
		{
			break;
		}
		cnt++;
	}
	if (cnt==num)
	printf("\n Entered number is prime number");
	else
	printf("\nEntered number is not a prime number");
	return 0;
}
