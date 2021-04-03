//create a function cal to check whether the no. is prime or not using pointer

#include<stdio.h>
#include<conio.h>

void prime(int num,int *a)
{
	int rem;
	while(*a<num)
	{
	rem=num%*a;
	if (rem==0)
		break;
	*a=*a+1;
	}
	
}

int main()
{
	int num;
	int cnt=2;
	printf("Enter any number : ");
	scanf("%d",&num);
	prime(num,&cnt);
	if(cnt==num)
		printf("\nEntered Number is prime Number");
	else
		printf("\nNot a Prime number");
	return 0;
}
