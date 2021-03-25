// DayNameUsinfIfElseIf.cpp : This file contains the 'main' function. Program execution begins and ends there.
//

#include <stdio.h>
#include<conio.h>

int main()
{
	int n;
	printf("Enter Day number between 1 to 7 : ");
	scanf_s("%d", &n);
	if (n == 1)
		printf("\nDay is Monday");
	else if (n == 2)
		printf("\nDay is Tuesday");
	else if (n == 3)
		printf("\nDay is Wednesday");
	else if (n == 4)
		printf("\nDay is Thursday");
	else if (n == 5)
		printf("\nDay is Friday");
	else if (n == 6)
		printf("\nDay is Saturday");
	else
		printf("\nDay is Sunday");
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
