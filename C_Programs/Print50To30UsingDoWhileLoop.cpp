// Print50To30UsingDoWhileLoop.cpp : This file contains the 'main' function. Program execution begins and ends there.
//

#include <iostream>

int main()
{
	int num = 50;
	do
	{
		printf("%d\t", num);
		num--;
	} while (num >= 30);
	return 0;
}