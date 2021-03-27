// FactorialUsingDoWhileLoop.cpp : This file contains the 'main' function. Program execution begins and ends there.
//

#include <iostream>

int main()
{
	int num, fact=1;
	printf("Enter a number : ");
	scanf_s("%d", &num);
	do
	{
		fact = num * fact;
		num--;
	} while (num > 0);
	printf("\nmFactorial of the number is : %d", fact);
	return 0;
}