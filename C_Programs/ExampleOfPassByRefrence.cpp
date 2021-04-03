//create a program to explain pass by reference  using pointer

#include<stdio.h>
#include<conio.h>
#include<string.h>


void changenum (int *ptr)
{
	*ptr=77;
	printf("\nNumber stored in location : %d",*ptr);
}

int main()
{
	int num=66;
	printf("\nEntered number in main : %d",num);
	changenum(&num);
	printf("\nValue inside main changed to : %d",num);
}

