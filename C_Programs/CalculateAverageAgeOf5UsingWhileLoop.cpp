// CalculateAverageAgeOf5UsingWhileLoop.cpp : This file contains the 'main' function. Program execution begins and ends there.
//

#include <iostream>

int main()
{
	int cnt = 1,age,total=0;
	float avg;
	while (cnt <= 5)
	{
		printf("Enter the age in years : ");
		scanf_s("%d", &age);
		total = total + age;
		cnt++;
	}
	avg = total / 5.0f;
	printf("\nAverage age is : %f years", avg);
	return 0;
}