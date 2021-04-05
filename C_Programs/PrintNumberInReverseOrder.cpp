/*Write a program in C to display the number in reverse order.
Input a number: 123
Expected Output :
The number in reverse order is : 321*/

#include<stdio.h>
#include<conio.h>

int main()
{
	int num,rem;
	printf("Enter any number : ");
	scanf("%d",&num);
	while(num!=0)
	{
		rem=num%10;
		num=num/10;
		printf("%d",rem);
	}
	return 0;
}
