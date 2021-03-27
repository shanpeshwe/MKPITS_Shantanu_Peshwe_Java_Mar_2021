// PerformOperationUsingSwitchStatement.cpp : This file contains the 'main' function. Program execution begins and ends there.
//

#include <iostream>

int main()
{
	int num1, num2;
	float res;
	char ch;
	printf("\nEnter the two numbers : ");
	scanf_s("%d%d", &num1, &num2);
	printf("\nEnter the Operation + , - , * , / : ");
	scanf_s(" %c", &ch);
	switch (ch)
	{
	case '+':
		res = (float)num1 + num2;
		break;
	case '-':
		res = (float)num1 - num2;
		break;
	case '*':
		res = (float)num1 * num2;
		break;
	case '/':
		res = (float)num1 / num2;
		break;
	default :
		printf("\nEntry is invalid");
		break;
	}
	printf("\nResult is : %f", res);
	return 0;
}