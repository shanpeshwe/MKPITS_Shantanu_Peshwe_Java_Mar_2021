// SalaryCalculationFromGradeAndExperience.cpp : This file contains the 'main' function. Program execution begins and ends there.
//

#include <stdio.h>
#include<conio.h>

int main()
{
	char grade;
	int exp;
	int salary = 0;
	printf("\nEnter the Grade e or m : ");
	scanf_s("%c", &grade);
	printf("\nEnter Experience between 1 to 3 : ");
	scanf_s("%d", &exp);
	switch (grade)
	{
	case 'e':
		if (exp >= 2)
			salary = 2000;
		else
			salary = 1000;
		break;
	case 'm':
		if (exp >= 2)
			salary = 4000;
		else
			salary = 3000;
		break;
	default:
		printf("\nInvalid input");
	}
	printf("\nSalary = %d", salary);
	return 0;
}

// Run program: Ctrl + F5 or Debug > Start Without Debugging menu
// Debug program: F5 or Debug > Start Debugging menu

// Tips for Getting Started: 
//   1. Use the Solution Explorer window to add/manage files
//   2. Use the Team Explorer window to connect to source control
//   3. Use the Output window to see build output and other messages
//   4. Use the Error List window to view errors
//   5. Go to Project > Add New Item to create new code files, or Project > Add Existing Item to add existing code files to the project
//   6. In the future, to open this project again, go to File > Open > Project and select the .sln file
