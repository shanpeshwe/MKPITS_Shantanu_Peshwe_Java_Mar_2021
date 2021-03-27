// Print1To10UsingDoWhileLoop.cpp : This file contains the 'main' function. Program execution begins and ends there.
//

#include <iostream>

int main()
{
	int num=1;
	do
	{
		printf("%d\t", num);
		num++;
	} while (num <= 10);
	return 0;
}