// DisplayTotalSalaryOf5UsingDoWhileLoop.cpp : This file contains the 'main' function. Program execution begins and ends there.
//

#include <iostream>

int main()
{
	int sa,ts=0,cnt=1;
	do
	{
		printf("\nEnter The Salary : ");
		scanf_s("%d", &sa);
		ts = ts + sa;
		cnt++;
	} while (cnt <= 5);
	printf("\nTotal Salary is : %d ", ts);
	return 0;
}