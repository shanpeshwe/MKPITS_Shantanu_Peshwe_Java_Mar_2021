// CalculateFactorialOfEachNumberIfPressedY.cpp : This file contains the 'main' function. Program execution begins and ends there.
//

#include <iostream>

int main()
{
	int num, fact;
	char ch='y';
	do
	{
		printf("\nEnter the number : ");
		scanf_s("%d", &num);
		fact = 1;
		while(num>0)
		{
			fact = fact * num;
			num--;
		} 
		printf("\nFactorial of the enter number is : %d", fact);
		printf("\nDo you want to continue y or n : ");
		fflush(stdin);
		scanf_s(" %c", &ch);
	} while (ch == 'y');
	return 0;
}