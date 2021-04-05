//Write a program in C to display the power of the number upto given an integer. eg 2 raise 3 = 8

#include<stdio.h>
#include<conio.h>

int main()
{
	int num,a,cnt,sum=1;
	
	printf("\nEnter any number : ");
	scanf("%d",&num);
	printf("\nEnter the raise to power : ");
	scanf("%d",&a);
	
	for (cnt=1;cnt<=a;cnt++)
	{
		sum=sum*num;
	}
	printf("\n%d to the power %d = %d",num,a,sum);
	return 0;
}
