// PerformOperationOn2NUmbersAsPerEnteredOperator.cpp : This file contains the 'main' function. Program execution begins and ends there.
//

#include<stdio.h>
#include<conio.h>

int main()
{
	int num1, num2;
	float res;
	char ch = 'y';
	char op;
	do
	{
		printf("\nEnter 2 numbers : ");
		scanf_s("%d%d", &num1, &num2);
		printf("\nEnter the Operator + , - , * ,/ : ");
		fflush(stdin);
		scanf_s(" %c", &op);
		res = 0;
		if (op == '+')
			res = (float)num1 + num2;
		else if (op == '-')
			res = (float)num1 - num2;
		else if (op == '*')
			res = (float)num1 * num2;
		else if (op == '/')
			res = (float)num1 / num2;
		else
			printf("\nInvalid character entered");
		printf("\nResult = %f", res);
		printf("\nDo you want to continue y or no : ");
		fflush(stdin);
		scanf_s(" %c", &ch);
	} while (ch == 'y');
	printf("\nBye");
	return 0;
}