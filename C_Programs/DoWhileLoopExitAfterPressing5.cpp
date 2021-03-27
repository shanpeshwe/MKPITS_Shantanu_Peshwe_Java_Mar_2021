// DoWhileLoopExitAfterPressing5.cpp : This file contains the 'main' function. Program execution begins and ends there.
//

#include <iostream>

int main()
{
	int num;
	do
	{
		printf("\nEnter the Number : ");
		scanf_s("%d", &num);
		printf("\nNumber is : %d\n", num);
	} while (num != 5);

	return 0;
}