// PrintTillInputNumberUsingDoWhileLoop.cpp : This file contains the 'main' function. Program execution begins and ends there.
//

#include <iostream>

int main()
{
	int num, cnt = 1;
	printf("Enter the Number : ");
	scanf_s("%d", &num);
	do
	{
		printf("%d\t", cnt);
		cnt++;
	} while (cnt <= num);
	return 0;
}