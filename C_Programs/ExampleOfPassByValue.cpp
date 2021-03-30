//example of pass by value 

#include<stdio.h>
#include<conio.h>

void changevalue(int num)
{
	num=num+5;
	printf("\nUpdated value : %d",num);
}

int main ()
{
	int num=5;
	printf("\nValue before function : %d",num);
	changevalue(num);
	printf("\nValue after function : %d",num);
	return 0;
}
