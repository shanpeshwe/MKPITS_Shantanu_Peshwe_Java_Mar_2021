// ExampleOfNestedIf.cpp : This file contains the 'main' function. Program execution begins and ends there.

#include<stdio.h>
#include<conio.h>

int main()
{
	int num;
	long int bus;
	printf("\nEnter number of years : ");
	scanf_s("%d", &num);
	printf("\nEnter business done : ");
	scanf_s("%ld", &bus);
	if (num > 10)
		if (bus > 5000000)
			printf("\nYou are most valuable MVS");
		else
			printf("\nLittle more effort required");
	else
		printf("\nNum of years is less than or equal to 10");
	return 0;
}