//Accept a number and print table of that number using for loop

#include<stdio.h>
#include<conio.h>

int main()
{
	int cnt,num,res;
	printf("Enter any number : ");
	scanf("%d",&num);
	printf("\nMultiplication Table of %d is as follows : ",num);
	for(cnt=1;cnt<=10;cnt++)
	{
		res=num*cnt;
		printf("\n\n%d\tx\t%d\t=\t%d\n",num,cnt,res);
	}
	return 0;
}

