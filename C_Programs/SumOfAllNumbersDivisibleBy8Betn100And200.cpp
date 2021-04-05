/*Write a program in C to find the number and sum of all integer between 100 and 200 which are divisible by 9.
Numbers between 100 and 200, divisible by 9 :
108 117 126 135 144 153 162 171 180 189 198
The sum : 1683*/

#include<stdio.h>
#include<conio.h>

int main()
{
	int num,rem,sum=0;
	printf("\nNumbers divisible by 9 between 100 and 200 are : ");
	for(num=100;num<=200;num++)
	{
		rem=num%9;
		if(rem==0)
		{
			printf("\n%d",num);
			sum=sum+num;
		}
	}
	printf("\nAnd sum of above numbers = %d",sum);
	return 0;
}
